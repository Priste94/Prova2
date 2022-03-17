package main;

import java.text.Annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class main {

	public static void main(String[] args) {
		
		var context = new AnnotationConfigApplicationContext(ConfigApp.class);
		
		Clienti cliente = context.getBean(Clienti.class);
		Bollini bollini = context.getBean(Bollini.class);
		
		System.out.println(cliente.getNome());
		System.out.println(bollini.getBollini());
		System.out.println(String.format("Il cliente %s ha %s", cliente.getNome(), cliente.getBollini()));
		
		context.close();

	}


}
