package ro.ase.cts.chain.clase;

public class ContCurent extends Cont{

	public ContCurent(String detinator, float sold) {
		super(detinator, sold);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void realizeazaPlata(float suma) {
		// TODO Auto-generated method stub
		if(getSold() > suma)
			
			{System.out.println(" S-a realizat plata de "+suma+ " din contul");
	super.setSold(super.getSold() + suma);}
		else {
			super.getSuccesor().realizeazaPlata(suma);
		} 
		
	
	
	}

	

	

}
