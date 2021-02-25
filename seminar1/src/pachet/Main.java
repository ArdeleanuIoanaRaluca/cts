package pachet;

import Clase.Girafa;
import Clase.Zebra;
import Clase.Zoo;

public class Main {

	public static void main(String[] args) {
		
		Zoo zoo=new Zoo();
		Girafa g1=new Girafa("Maia",300);
		Girafa g2= new Girafa("Lola");
		Zebra z1= new Zebra ("Z1",20);
		Zebra z2=new Zebra("Z2");
		
		zoo.AddAnimal(g1);
		zoo.AddAnimal(g2);
		zoo.AddAnimal(z1);
		zoo.AddAnimal(z2);
		zoo.feedAllAnimals();
		

	}

}
