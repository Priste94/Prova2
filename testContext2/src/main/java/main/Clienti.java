package main;

import org.springframework.stereotype.Component;

@Component
public class Clienti {
	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
