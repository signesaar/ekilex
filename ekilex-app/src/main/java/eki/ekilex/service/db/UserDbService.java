package eki.ekilex.service.db;

import static eki.ekilex.data.db.Tables.EKI_USER;
import static eki.ekilex.data.db.Tables.EKI_USER_APPLICATION;

import java.util.List;
import java.util.Optional;

import org.jooq.DSLContext;
import org.jooq.Field;
import org.jooq.impl.DSL;
import org.springframework.stereotype.Component;

import eki.common.service.db.AbstractDbService;
import eki.ekilex.data.EkiUser;
import eki.ekilex.data.EkiUserApplication;
import eki.ekilex.data.db.tables.records.EkiUserRecord;

@Component
public class UserDbService extends AbstractDbService {

	private DSLContext create;

	public UserDbService(DSLContext context) {
		create = context;
	}

	public EkiUser getUserByEmail(String email) {

		return create
				.select(
						EKI_USER.ID,
						EKI_USER.NAME,
						EKI_USER.EMAIL,
						EKI_USER.PASSWORD,
						EKI_USER.ACTIVATION_KEY,
						EKI_USER.RECOVERY_KEY,
						EKI_USER.IS_ADMIN.as("admin"),
						EKI_USER.IS_ENABLED.as("enabled")
						)
				.from(EKI_USER)
				.where(EKI_USER.EMAIL.eq(email))
				.fetchOptionalInto(EkiUser.class)
				.orElse(null);
	}

	public Long getUserIdByEmail(String email) {

		return create
				.select(EKI_USER.ID)
				.from(EKI_USER)
				.where(EKI_USER.EMAIL.eq(email))
				.fetchOptionalInto(Long.class)
				.orElse(null);
	}

	public String getUserEmailByRecoveryKey(String recoveryKey) {

		return create
				.select(EKI_USER.EMAIL)
				.from(EKI_USER)
				.where(EKI_USER.RECOVERY_KEY.eq(recoveryKey))
				.fetchOptionalInto(String.class)
				.orElse(null);
	}

	public Long createUser(String email, String name, String password, String activationKey) {
		EkiUserRecord ekiUser = create.newRecord(EKI_USER);
		ekiUser.setEmail(email);
		ekiUser.setName(name);
		ekiUser.setPassword(password);
		ekiUser.setActivationKey(activationKey);
		ekiUser.store();
		return ekiUser.getId();
	}

	public EkiUser activateUser(String activationKey) {
		Optional<EkiUserRecord> ekiUser = create.selectFrom(EKI_USER).where(EKI_USER.ACTIVATION_KEY.eq(activationKey)).fetchOptional();
		if (ekiUser.isPresent()) {
			ekiUser.get().setActivationKey(null);
			ekiUser.get().store();
			return ekiUser.get().into(EkiUser.class);
		}
		return null;
	}

	public void setAdmin(Long userId, boolean isAdmin) {
		create.update(EKI_USER).set(EKI_USER.IS_ADMIN, isAdmin).where(EKI_USER.ID.eq(userId)).execute();
	}

	public void enableUser(Long userId, boolean enable) {
		create.update(EKI_USER).set(EKI_USER.IS_ENABLED, enable).where(EKI_USER.ID.eq(userId)).execute();
	}

	public void createUserApplication(Long userId, String[] datasets, String comment) {

		create
			.insertInto(EKI_USER_APPLICATION, EKI_USER_APPLICATION.USER_ID, EKI_USER_APPLICATION.DATASETS, EKI_USER_APPLICATION.COMMENT)
			.values(userId, datasets, comment)
			.execute();
	}

	public List<EkiUserApplication> getUserApplications(Long userId) {

		Field<Boolean> basicApplicationField = DSL.field(
				EKI_USER_APPLICATION.DATASETS.isNull()
				.and(DSL.or(EKI_USER_APPLICATION.COMMENT.isNull(), EKI_USER_APPLICATION.COMMENT.eq(""))));

		return create
				.select(
						EKI_USER_APPLICATION.USER_ID,
						EKI_USER_APPLICATION.DATASETS.as("dataset_codes"),
						EKI_USER_APPLICATION.COMMENT,
						EKI_USER_APPLICATION.CREATED,
						basicApplicationField.as("basic_application")
						)
				.from(EKI_USER_APPLICATION)
				.where(EKI_USER_APPLICATION.USER_ID.eq(userId))
				.fetchInto(EkiUserApplication.class);
	}

	public void setUserRecoveryKey(Long userId, String recoveryKey) {

		create
				.update(EKI_USER)
				.set(EKI_USER.RECOVERY_KEY, recoveryKey)
				.where(EKI_USER.ID.eq(userId)).execute();
	}

	public void setUserPassword(String email, String encodedPassword) {

		EkiUserRecord ekiUser = create.selectFrom(EKI_USER).where(EKI_USER.EMAIL.eq(email)).fetchOne();
		ekiUser.setRecoveryKey(null);
		ekiUser.setPassword(encodedPassword);
		ekiUser.store();
	}
}
