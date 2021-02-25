package pachet;

import Clase.Girafa;
import Clase.Zoo;

public class Main {

	public static void main(String[] args) {
		
		Zoo zoo=new Zoo();
		Girafa g1=new Girafa("Maia",300);
		Girafa g2= new Girafa("Lola");
		
		zoo.AddAnimal(g1);
		zoo.AddAnimal(g2);
		zoo.feedAllAnimals();
		

	}

}
