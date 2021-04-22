package ro.ase.cts.strategy.clase;

public class Card implements ModalitateDePlata {

	private float sold;
	
	@Override
	public void achita(float suma) {
		
		if(suma <= sold)
		{
		System.out.println("S-a realizat plata cu cardul pentru suma " + suma);
		sold-=suma;}

	else 
		System.out.println("Fonduri insuficiente! ");
		
		
		
}

	public Card(float sold) {
		super();
		this.sold = sold;
	}}
