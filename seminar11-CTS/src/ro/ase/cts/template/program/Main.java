package ro.ase.cts.template.program;

import ro.ase.cts.template.clase.SpectatorCuHandicap;
import ro.ase.cts.template.clase.SpectatorUzual;
import ro.ase.cts.template.clase.TemplateIntrareStadion;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TemplateIntrareStadion spectatorUzual= new SpectatorUzual("Florin");
		spectatorUzual.intrarePeStadion();
		
		TemplateIntrareStadion spectatorCuHandicap= new SpectatorCuHandicap("Anca");
		
		spectatorCuHandicap.intrarePeStadion();
		

	}

}
