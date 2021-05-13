package ro.ase.cts.observer.program;

import ro.ase.cts.observer.clase.Client;
import ro.ase.cts.observer.clase.ManagerSala;
import ro.ase.cts.observer.clase.Subiect;

public class Main {

	public static void main(String[] args) {
		ManagerSala manager= new ManagerSala();
		 Client client1= new Client("Popescu");
		 Client client2= new Client("Ionescu");
		 Client client3= new Client("Gigel");
		 
		 manager.adaugareObserver(client1);
		 manager.adaugareObserver(client2);
		 manager.adaugareObserver(client3);
		 
		 manager.anuntaMeciFotbal();
		 manager.stergereObserver(client2);
		 manager.anuntaMeciFotbal();
		 
		 
		 

	}

}
