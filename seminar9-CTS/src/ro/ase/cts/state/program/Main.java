package ro.ase.cts.state.program;

import ro.ase.cts.state.clase.Libera;
import ro.ase.cts.state.clase.Masa;

public class Main {

	public static void main(String[] args) {
	
		
		Masa masa = new Masa(20);
		masa.rezerva();
		masa.ocupata();
		masa.rezerva();
		masa.elibereaza();
		
		
		masa.setStare(new Libera());
		masa.rezerva();
		masa.elibereaza();

	}

}
