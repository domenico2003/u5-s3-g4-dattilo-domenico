package Application.AdapterPattern;

import java.time.LocalDate;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class AdapterRunner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		System.out.println("######################### ADAPTER #########################");

		Info inf = new Info("Domenico", "Dattilo", LocalDate.of(2003, 05, 20));

		System.out.println("oggetto info: " + inf);

		UserData usd = new UserData(new UserDataAdapter(inf));

		System.out.println("oggetto info adattato a userData: " + usd);
	}

}
