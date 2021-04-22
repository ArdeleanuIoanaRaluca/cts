package ro.ase.cts.strategy.clase;

public class Client {

	private String nume;
	private ModalitateDePlata modalitateDePlata;
	
	
	
	public Client(String nume, ModalitateDePlata modalitateDePlata) {
		super();
		this.nume = nume;
		this.modalitateDePlata = modalitateDePlata;
	}
	public ModalitateDePlata getModalitateDePlata() {
		return modalitateDePlata;
	}
	public void setModalitateDePlata(ModalitateDePlata modalitateDePlata) {
		this.modalitateDePlata = modalitateDePlata;
	}
	
	public void platesteNota(float suma)
	{
		System.out.println(this.nume + " are de platit nota in valoare de "+suma+" lei");
	modalitateDePlata.achita(suma);
	}
	
	
}
