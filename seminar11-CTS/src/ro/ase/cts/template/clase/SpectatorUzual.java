package ro.ase.cts.template.clase;

public class SpectatorUzual extends TemplateIntrareStadion {

	private String nume;

	public SpectatorUzual(String nume) {
		super();
		this.nume = nume;
	}
	@Override
	public void asezareCoada() {
		System.out.println("spectatorul "+this.nume+" s-a asezat la coada");
	}

	@Override
	public void prezentareBilet() {
		System.out.println("spectatorul "+this.nume+" a prezentat biletul");
		
	}

	@Override
	public void controlCorporal() {
		System.out.println("spectatorul "+this.nume+" a fost controlat corporal");
		
	}

	@Override
	public void ocupaLoc() {
		System.out.println("spectatorul "+this.nume+" a ocupat locul");
		
	}
	
}
