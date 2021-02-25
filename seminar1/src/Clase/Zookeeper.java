package Clase;

public class Zookeeper {

	private String nume;

	public Zookeeper(String nume) {
		super();
		this.nume = nume;
	}

	public Zookeeper() {
		// TODO Auto-generated constructor stub
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public void feed(Animal a) {
		System.out.println(nume + " hraneste animalul " + a.getNume());

	}
}
