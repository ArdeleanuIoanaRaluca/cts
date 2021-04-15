package ro.ase.cts.flyweight.program;

import ro.ase.cts.flyweight.clase.FabricaFlyweight;
import ro.ase.cts.flyweight.clase.Client;

import ro.ase.cts.flyweight.clase.Rezervare;

public class Program {

	public static void main(String[] args) {
		Rezervare rezervare = new Rezervare(3, 4, 3);
		Rezervare rezervare1 = new Rezervare(2, 5, 2);
		Rezervare rezervare2 = new Rezervare(5, 2, 4);
		
		
		FabricaFlyweight fabricaFlyweight = new FabricaFlyweight();
		Client client = (Client) fabricaFlyweight.getClient("0700000000");
        client.afiseazaInformatii(rezervare);
        
		Client client1 = (Client) fabricaFlyweight.getClient("0710000000");
        client1.afiseazaInformatii(rezervare1);
        fabricaFlyweight.getClient("0700000000").afiseazaInformatii(rezervare2);
	}

}