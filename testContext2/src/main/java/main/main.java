package main;

import java.text.Annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class main {

	public static void main(String[] args) {
		
		var context = new AnnotationConfigApplicationContext(ConfigApp.class);
		
		Clienti cliente = context.getBean(Clienti.class);
		cliente.setNome("Nicola");
		System.out.println(cliente); // classe viene istanziata e inserita nel context 
		System.out.println(cliente.getNome());
		
		

		
		String saluti = context.getBean(String.class);
		System.out.println(saluti);
		
		context.close();

	}


}
