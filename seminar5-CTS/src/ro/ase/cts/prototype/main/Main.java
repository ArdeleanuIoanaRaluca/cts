package ro.ase.cts.prototype.main;

import ro.ase.cts.prototype.clase.Client;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Client client1= new Client("Gigel",23 ,"ro",11);
		Client client2=(Client)client1.copiaza();
		
		System.out.println(client1.toString());
		System.out.println(client2.toString());

	}

}
