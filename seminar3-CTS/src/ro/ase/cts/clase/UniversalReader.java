package ro.ase.cts.clase;


import java.io.FileNotFoundException;
import java.io.Reader;
import java.util.List;

import ro.ase.cts.clase.readers.PupilReader;
import ro.ase.cts.clase.readers.StudentReader;



public class UniversalReader  {
	//TO DO 

	//punct de legatura intre readere

	
	public static List<Aplicant> readAplicants(StudentReader studentReader) throws NumberFormatException, FileNotFoundException{
		return studentReader.readAplicants();
		
	}

}
