package ro.ase.cts.strategy.program;

import ro.ase.cts.strategy.clase.Card;
import ro.ase.cts.strategy.clase.Cash;
import ro.ase.cts.strategy.clase.Client;

public class Main {

	public static void main(String[] args) {
		Card card= new Card(500);
		
		Client client = new Client("Gigel",card);
		
		client.platesteNota(300);
		client.setModalitateDePlata(new Cash());
		client.platesteNota(50);
		
		
		client.setModalitateDePlata(card);
		client.platesteNota(250);
	}

}
