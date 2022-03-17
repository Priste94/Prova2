package main;

import org.springframework.context.annotation.*;

@Configuration
@ComponentScan
public class ConfigApp {
	
	@Bean
	String saluti() {
		return "Ciao!";
	}

}
