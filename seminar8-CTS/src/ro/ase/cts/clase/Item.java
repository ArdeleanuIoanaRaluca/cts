package ro.ase.cts.clase;

public class Item implements ComponentaMeniu{

	private String numeItem;
	
	public Item(String numeItem) {
		super();
		this.numeItem = numeItem;
	}

	@Override
	public void adaugareNod(ComponentaMeniu componentaMeniu) {
		throw new IllegalArgumentException("Metoda nu este implementata");
	}

	@Override
	public void stergereNod(ComponentaMeniu componentaMeniu) {
		throw new IllegalArgumentException("Metoda nu este implementata");
		
	}

	

	@Override
	public ComponentaMeniu getComponenta(int index) throws Exception {
		throw new IllegalArgumentException("Metoda nu este implementata");
	}

	@Override
	public void afisareInformatii() {
		// TODO Auto-generated method stub
		System.out.println("Item "+numeItem);
	}



	

}