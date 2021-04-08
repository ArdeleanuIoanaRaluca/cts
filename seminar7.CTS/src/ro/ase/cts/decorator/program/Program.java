package ro.ase.cts.decorator.program;

import ro.ase.cts.decorator.clase.Bilet;
import ro.ase.cts.decorator.clase.DecoratorAbstract;
import ro.ase.cts.decorator.clase.DecoratorCuMesajeSustinere;
import ro.ase.cts.decorator.clase.DecoratorMesajLaMultiAni;;

public class Program {

	public static void main(String[] args) {
		Bilet bilet = new Bilet("FCSB", "Dinamo", "Gigel");
		bilet.rezervaBilet();
		
		DecoratorCuMesajeSustinere decorator = new DecoratorCuMesajeSustinere(bilet);
		decorator.rezervaBilet();

		DecoratorMesajLaMultiAni decorator2 = new DecoratorMesajLaMultiAni(bilet);
		System.out.println();
		decorator2.rezervaBilet();
		
		DecoratorAbstract decorator3 = new DecoratorMesajLaMultiAni(decorator);
		System.out.println();
		
	}

}