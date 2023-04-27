package pe.luismay.demospringbot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;

@Controller
@SpringBootApplication
public class DemospringbotApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemospringbotApplication.class, args);
	}

	
	@GetMapping("/")
	String holaMundo(@RequestParam(defaultValue = "mundo") String nombre, Model model) {
		model.addAttribute("nombre", nombre + ", Bienvenido!");
		return "hola-mundo";
	}
}
