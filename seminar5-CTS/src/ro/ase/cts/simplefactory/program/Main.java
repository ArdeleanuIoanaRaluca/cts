package ro.ase.cts.simplefactory.program;

import ro.ase.cts.simplefactory.clase.FactoryJucatori;
import ro.ase.cts.simplefactory.clase.Jucator;
import ro.ase.cts.simplefactory.clase.Portar;
import ro.ase.cts.simplefactory.clase.TipJucator;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

   
		try{
			FactoryJucatori fabrica= new FactoryJucatori();
			Jucator jucator1 = fabrica.createJucator(TipJucator.Fundas, "Gigel");
			Jucator jucator2 = fabrica.createJucator(TipJucator.Portar, "Dorel");
	        System.out.println(jucator1.toString());
	        System.out.println(jucator2.toString());
			
			}catch (Exception e) {
				e.printStackTrace();
			}

}
}