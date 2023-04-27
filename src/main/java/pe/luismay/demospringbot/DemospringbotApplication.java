package pe.luismay.demospringbot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class DemospringbotApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemospringbotApplication.class, args);
	}
	
	@GetMapping
	String holaMundo(){
		return "hola mundo";
	}
}
