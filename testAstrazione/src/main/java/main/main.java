package main;

import java.text.Annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import config.ConfigApp;
import model.Clienti;
import service.ClientiService;

public class main {

	public static void main(String[] args) {

		var context = new AnnotationConfigApplicationContext(ConfigApp.class);

		var cliente = new Clienti();
		
		cliente.setNome("Maria");
		cliente.setBollini(5000);
		
		var clientiService = context.getBean(ClientiService.class);
		clientiService.saveAndNotify(cliente);
		
		
		context.close();

	}


}
