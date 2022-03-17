package main;

import java.text.Annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class main {

	public static void main(String[] args) {
		
		var context = new AnnotationConfigApplicationContext(ConfigApp.class);
		
		Clienti cliente = context.getBean(Clienti.class);
		System.out.println(cliente.getNome());
		
		Clienti cliente2 = context.getBean("Cliente2",Clienti.class);
		System.out.println(cliente2.getNome());
		
		String saluti = context.getBean(String.class);
		System.out.println(saluti);
		
		context.close();

	}


}
