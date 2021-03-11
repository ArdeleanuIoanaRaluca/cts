package ro.ase.cts.programe;

import java.io.FileNotFoundException;
import java.util.List;



import ro.ase.cts.clase.Angajat;
import ro.ase.cts.clase.Aplicant;
import ro.ase.cts.clase.Proiect;
import ro.ase.cts.clase.Student;
import ro.ase.cts.clase.UniversalReader;
import ro.ase.cts.clase.readers.EmployeeReader;
import ro.ase.cts.clase.readers.PupilReader;
import ro.ase.cts.clase.readers.StudentReader;
import ro.ase.cts.clase.readers.Reader;;
public class Program {

	public static void main(String[] args) {
		
		System.out.println(Student.getSumaConstanta());
		List<Aplicant> listaAplicanti;
		try { 
			//StudentReader e = new StudentReader();
			listaAplicanti = UniversalReader.readAplicants(new StudentReader("studenti.txt"));
			Proiect proiect = new Proiect(80);
			for(Aplicant aplicant:listaAplicanti)
				{System.out.println(aplicant.toString());
			System.out.println("Suma finantata: " + aplicant.getSumaFinantata());
			aplicant.afisareStatutProiect(proiect);}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
