package Clase;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
	private Zookeeper zookeeper;
	private List<Animal> animale;
	public Zoo(Zookeeper zookeeper, List<Animal> animale) {
		super();
		this.zookeeper = zookeeper;
		this.animale = animale;
	}
	
	public Zoo() {
		
		this.zookeeper = new Zookeeper();
		this.zookeeper.setNume("Gigel");
		this.animale = new ArrayList<>();
	}
	
public void AddAnimal(Animal animal)
{ this.animale.add(animal);
	}

public void  feedAllAnimals()
{
	for (Animal a : this.animale)
	{
		zookeeper.feed(a);
	}
	}

}
