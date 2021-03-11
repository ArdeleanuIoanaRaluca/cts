package ro.ase.cts.clase;

import java.util.Arrays;

public class Student extends Aplicant {
	protected String facultate;
	protected int an_studii;
	private static float sumaConstanta=10;
	
	
	public String getFacultate() {
		return facultate;
	}
	public void setFacultate(String facultate) {
		this.facultate = facultate;
	}
	public int getAn_studii() {
		return an_studii;
	}
	public void setAn_studii(int an_studii) {
		this.an_studii = an_studii;
	}


	public Student() {
		super();
		
	}
	
	public Student(String nume, String prenume, int varsta, int punctaj, int nr_proiecte, String[] denumireProiect, String facultate, int an_studii) {
		super(nume,prenume,varsta,punctaj,nr_proiecte,denumireProiect);
		this.facultate = facultate;
		this.an_studii = an_studii;
	}
	@Override
	public String toString() {
		StringBuilder str= new StringBuilder("Student: ");
		str.append(super.toString()).append(" facultate ").append(facultate).append(" an studii  ").append(an_studii);
		return  str.toString();	}
	
	
	public int finantare() {
		int s=20;
		System.out.println("Studentul "+getNume()+" "+getPrenume()+" primeste"+s+" Euro/zi in proiect.");
		return s;
	}
	
	
	
	public static float getSumaConstanta() {
		return sumaConstanta;
	}
	public static void setSumaFinantata(float sumaConstanta) {
		Student.sumaConstanta = sumaConstanta;
	}
	
	
	@Override
	public float getSumaFinantata() {
		// TODO Auto-generated method stub
		return sumaConstanta;
	}
	
}
