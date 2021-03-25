package ro.ase.cts.factorymethod.clase;

public class MijlocasFactory implements JucatorFactory{

	
	

	@Override
	public Jucator createJucator(String nume){
		return new Mijlocas(nume);
	}
}
