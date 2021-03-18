package ro.ase.cts.clase;

public class Parc {

	private String nume;
	private int anInfiintare;
	private float suprafata;
	
	
private static Parc instanta = null;
	
	public static synchronized Parc getInstance(String nume, int anInfiintare, float suprafata) 
	{
		if(instanta==null)
		{
			instanta = new Parc (nume, anInfiintare,suprafata);
		}
		return instanta;
	}
	private Parc(String nume, int anInfiintare, float suprafata) {
		super();
		this.nume = nume;
		this.anInfiintare = anInfiintare;
		this.suprafata = suprafata;
	}
	public void setNume(String nume) {
		this.nume = nume;
	}
	public void setAnInfiintare(int anInfiintare) {
		this.anInfiintare = anInfiintare;
	}
	public void setSuprafata(float suprafata) {
		this.suprafata = suprafata;
	}
	@Override
	public String toString() {
		return "parc [nume=" + nume + ", anInfiintare=" + anInfiintare + ", suprafata=" + suprafata + "]";
	}
	
	
}
