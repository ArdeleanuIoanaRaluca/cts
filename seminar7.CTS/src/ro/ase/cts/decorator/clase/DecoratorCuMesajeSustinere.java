package ro.ase.cts.decorator.clase;

public class DecoratorCuMesajeSustinere extends DecoratorAbstract {

	public DecoratorCuMesajeSustinere(BiletAbstract biletAbstract) {
		super(biletAbstract);
		
	}

	
	@Override
	public void rezervaBilet() {
		super.rezervaBilet();
		System.out.println(" Sustinem echipa gazda "+ ((Bilet)super.getBiletAbstract()).getNumeGazda());	}
}

    