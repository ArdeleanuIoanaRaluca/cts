package ro.ase.cts.simplefactory.clase;

public abstract  class Jucator {

	
	private String name;

	public Jucator(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
