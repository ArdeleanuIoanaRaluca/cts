package ro.ase.cts.clase;

public interface ComponentaMeniu {
	
	void adaugareNod(ComponentaMeniu componentaMeniu);
	void stergereNod(ComponentaMeniu componentaMeniu);
	void afisareInformatii();
	ComponentaMeniu getComponenta(int index) throws Exception;

}
