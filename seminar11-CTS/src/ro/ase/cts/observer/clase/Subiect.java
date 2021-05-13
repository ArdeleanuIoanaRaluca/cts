package ro.ase.cts.observer.clase;

import java.util.ArrayList;
import java.util.List;

public abstract class Subiect {

	private List<Observer> observeri;

	public Subiect() {
		super();
		this.observeri = new ArrayList<>();
	}
	
	public void adaugareObserver( Observer observer)
	{
		observeri.add(observer);	}
	
	public void stergereObserver( Observer observer)
	{
		observeri.remove(observer);	
		}
	
	public void notificaClienti( String mesaj)
	{
		for(Observer observeri:observeri)
observeri.primesteNotificare(mesaj);}
	
}