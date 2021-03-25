package ro.ase.cts.factorymethod.program;

import ro.ase.cts.factorymethod.clase.JucatorFactory;
import ro.ase.cts.factorymethod.clase.MijlocasFactory;
import ro.ase.cts.factorymethod.clase.PortarFactory;
import ro.ase.cts.simplefactory.clase.FactoryJucatori;
import ro.ase.cts.factorymethod.clase.AtacantFactory;
import ro.ase.cts.factorymethod.clase.Jucator;

public class Main {

	public static void printeazaJucator(JucatorFactory fabrica , String nume)
	
	{
	    Jucator jucator1 = fabrica.createJucator(nume);
	    System.out.println(jucator1);
	    
	    
	    
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		printeazaJucator(new PortarFactory(), "Dorel");
		printeazaJucator(new AtacantFactory(), "Bogdan");
		printeazaJucator(new MijlocasFactory(), "Ionel");

	}

}
