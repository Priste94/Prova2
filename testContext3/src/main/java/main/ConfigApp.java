package main;

import org.springframework.context.annotation.*;

@Configuration
//@ComponentScan
public class ConfigApp {
	
	
	@Bean
	public Bollini bollini() {
		
		Bollini b = new Bollini();
		b.setBollini(1500);
		
		return b;
	}
	
	
	@Bean
	@Primary
	Clienti cliente() {
		Clienti cliente = new Clienti();
		cliente.setNome("Nicola");
		cliente.setBollini(bollini());
		
		return cliente;
	}
	

}
