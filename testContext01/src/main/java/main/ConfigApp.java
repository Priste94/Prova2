package main;

import org.springframework.context.annotation.*;

@Configuration
public class ConfigApp {
	
	@Bean(name = "Cliente1")
	@Primary
	Clienti cliente1() {
		Clienti cliente = new Clienti();
		cliente.setNome("Nicola");
		
		return cliente;
	}
	
	@Bean(name = "Cliente2")
	Clienti cliente2() {
		Clienti cliente = new Clienti();
		cliente.setNome("Andrea");
		
		return cliente;
	}
	
	@Bean
	String saluti() {
		return "Ciao!";
	}

}
