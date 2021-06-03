package ro.ase.cts.dubluri;

import java.util.List;

import ro.ase.cts.student.IStudent;

public class StudentFake implements IStudent {

	String valoareGetNume;
	float valoareGetMedie;
	int  valoareGetNota;
	boolean valoareAreRestante;
	
	@Override
	public String getNume() {
		// TODO Auto-generated method stub
		return valoareGetNume;
	}

	@Override
	public void setNume(String nume) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Integer> getNote() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void adaugaNota(int nota) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public float calculeazaMedie() {
		// TODO Auto-generated method stub
		return valoareGetMedie;
	}

	@Override
	public int getNota(int index) {
		// TODO Auto-generated method stub
		return valoareGetNota;
		
	}

	@Override
	public boolean areRestante() {
		// TODO Auto-generated method stub
		return valoareAreRestante;
	}

	public void setValoareGetNume(String valoareGetNume) {
		this.valoareGetNume = valoareGetNume;
	}

	public void setValoareGetMedie(float valoareGetMedie) {
		this.valoareGetMedie = valoareGetMedie;
	}

	public void setValoareGetNota(int valoareGetNota) {
		this.valoareGetNota = valoareGetNota;
	}

	public void setValoareAreRestante(boolean valoareAreRestante) {
		this.valoareAreRestante = valoareAreRestante;
	}

	
	
}
