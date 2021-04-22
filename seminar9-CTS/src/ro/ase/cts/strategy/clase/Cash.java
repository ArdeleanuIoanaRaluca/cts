package ro.ase.cts.strategy.clase;

public class Cash  implements ModalitateDePlata{

	@Override
	public void achita(float suma) {
		System.out.println("S-a realizat plata cash pentru suma " + suma);
		
	}

}
