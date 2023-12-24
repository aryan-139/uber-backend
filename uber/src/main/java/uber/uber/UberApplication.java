package uber.uber;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UberApplication {

	public static void main(String[] args) {
		SpringApplication.run(UberApplication.class, args);

		int a = 10;
		int b = 20;
		int c = a + b;
		System.out.println("Sum of a and b is " + c);
	}

}
