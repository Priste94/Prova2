package main;

public class Bollini {
	
	private int bollini;
	
	

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
