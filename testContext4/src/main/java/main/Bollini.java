package main;

import org.springframework.stereotype.Component;

@Component
public class Bollini {
	
	private int bollini = 1500;

	public Bollini() {
		System.out.println("classe Bollini istanziata");
	}

	@Override
	public String toString() {
		return  bollini + " Bollini";
	}

	public int getBollini() {
		return bollini;
	}

	public void setBollini(int bollini) {
		this.bollini = bollini;
	}
	
	

}
