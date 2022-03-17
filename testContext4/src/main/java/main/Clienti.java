package main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Clienti {
	private String nome = "nicola";
	
	@Autowired
	private Bollini bollini;
	
//	private final Bollini bollini;
//	
//	public Clienti(Bollini bollini) {
//	
//		this.bollini = bollini;
//	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Bollini getBollini() {
		return bollini;
	}

	
}
