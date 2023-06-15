package Application.chainOfResponsibilityPattern;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ChainOfResponsibilityRunner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		System.out.println("######################### CHAIN OF RESPONSIBILITY #########################");
//		LoggerFilter logger = new LoggerFilter();
//		PasswordFilter password = new PasswordFilter();
//		RoleCheckerFilter role = new RoleCheckerFilter();
//
//		logger.setNext(password);
//		password.setNext(role);
//
//		logger.check("user@gmail.com", "1234");
	}

}
