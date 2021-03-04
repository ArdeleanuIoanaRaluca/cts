package ro.ase.cts.clase;


import java.io.FileNotFoundException;
import java.io.Reader;
import java.util.List;

import ro.ase.cts.clase.readers.PupilReader;



public class UniversalReader  {
	//TO DO 

	//punct de legatura intre readere

	
	public static List<Aplicant> readAplicants(PupilReader pupilReader) throws NumberFormatException, FileNotFoundException{
		return pupilReader.readAplicants();
		
	}

}
