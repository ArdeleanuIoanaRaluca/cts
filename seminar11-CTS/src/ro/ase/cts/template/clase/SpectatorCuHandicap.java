package ro.ase.cts.template.clase;

public class SpectatorCuHandicap extends TemplateIntrareStadion{
	private String nume;

	public SpectatorCuHandicap(String nume) {
		super();
		this.nume = nume;
	}
	
	@Override
	public void asezareCoada() {
		System.out.println("Spectatorul"+this.nume+" a fost preluat de la coada");

	}

	@Override
	public void prezentareBilet() {
		System.out.println("spectatorul"+this.nume+" a prezentat biletul");
		
	}

	@Override
	public void controlCorporal() {
		System.out.println("spectatorul"+this.nume+" a fost controlat corporal dar si la carucior");
		
	}

	@Override
	public void ocupaLoc() {
		System.out.println("spectatorul"+this.nume+" a ocupat locul special.");
		
	}

}
