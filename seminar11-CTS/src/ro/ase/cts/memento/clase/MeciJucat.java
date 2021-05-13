package ro.ase.cts.memento.clase;

public class MeciJucat {

	
	private int nrSpectatori;
	private String echipaGazda;
	private String echipaOaspete;
	private int nrBileteVandute;
	private int nrSticleVandute;
	private int jandarmi;
	public MeciJucat(int nrSpectatori, String echipaGazda, String echipaOaspete, int nrBileteVandute,
			int nrSticleVandute, int jandarmi) {
		super();
		this.nrSpectatori = nrSpectatori;
		this.echipaGazda = echipaGazda;
		this.echipaOaspete = echipaOaspete;
		this.nrBileteVandute = nrBileteVandute;
		this.nrSticleVandute = nrSticleVandute;
		this.jandarmi = jandarmi;
	}
	
	public Memento salvareInformatii()
	{
		Memento memento= new Memento(nrSpectatori, echipaGazda, echipaOaspete);
		return memento;
	}
	
	public void revenire(Memento memento)
	{
		this.nrSpectatori= memento.getNrSpectatori();
		this.echipaGazda= memento.getEchipaGazda();
		this.echipaOaspete= memento.getEchipaOaspete();
	}
	
	

	public void setNrSpectatori(int nrSpectatori) {
		this.nrSpectatori = nrSpectatori;
	}

	public void setEchipaGazda(String echipaGazda) {
		this.echipaGazda = echipaGazda;
	}

	public void setEchipaOaspete(String echipaOaspete) {
		this.echipaOaspete = echipaOaspete;
	}

	public void setNrBileteVandute(int nrBileteVandute) {
		this.nrBileteVandute = nrBileteVandute;
	}

	public void setNrSticleVandute(int nrSticleVandute) {
		this.nrSticleVandute = nrSticleVandute;
	}

	public void setJandarmi(int jandarmi) {
		this.jandarmi = jandarmi;
	}

	@Override
	public String toString() {
		return "MeciJucat [nrSpectatori=" + nrSpectatori + ", echipaGazda=" + echipaGazda + ", echipaOaspete="
				+ echipaOaspete + ", nrBileteVandute=" + nrBileteVandute + ", nrSticleVandute=" + nrSticleVandute
				+ ", jandarmi=" + jandarmi + "]";
	}
	
	
	
	
	
}
