package springapp1.actividad4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class Actividad4Application extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(Actividad4Application.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(Actividad4Application.class, args);
		//System.out.println("¡Hola, Spring Boot!");
	}

}
