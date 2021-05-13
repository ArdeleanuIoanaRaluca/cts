package ro.ase.cts.template.clase;

public abstract class TemplateIntrareStadion {
	public abstract void asezareCoada();
	public abstract void prezentareBilet();
	public abstract void controlCorporal();
	public abstract void ocupaLoc();
	
	public final void intrarePeStadion() {
		asezareCoada();
		prezentareBilet();
		controlCorporal();
		ocupaLoc();
	}
	
	
}
