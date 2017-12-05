package eki.ekilex.manual;

import eki.ekilex.runner.TermekiToDomainCsvRunner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TermekiToDomainCsv {

	private static Logger logger = LoggerFactory.getLogger(TermekiToDomainCsv.class);

	public static void main(String[] args) {

		ConfigurableApplicationContext applicationContext;

		applicationContext = new ClassPathXmlApplicationContext("service-config.xml", "db-config.xml", "db-termeki-config.xml");
		TermekiToDomainCsvRunner runner = applicationContext.getBean(TermekiToDomainCsvRunner.class);

		try {
			applicationContext.registerShutdownHook();
			runner.execute();
		} catch (Exception e) {
			logger.error("Unexpected behaviour of the system", e);
		} finally {
			applicationContext.close();
		}
	}
}
