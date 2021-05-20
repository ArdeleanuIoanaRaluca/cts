package ro.ase.cts.clase;

import static org.junit.Assert.*;

import org.junit.Test;

public class StudentTests {

	@Test
	public void testCunstructorCuParametru() {
	String nume="Gigel";	
	Student student = new Student(nume);
	//if(nume!= student.getNume())
	//{
		//fail("numele nu este corect ");
		
	//}
	assertEquals(nume, student.getNume());
	}
	
	@Test
	public void testConstructorFaraParametri()
	{
		Student student = new Student();
		assertEquals("Student", student.getNume());
	}
	@Test
	public void testAreRestante()
	{
		Student student= new Student();
		student.adaugaNota(3);
		student.adaugaNota(10);
		assertTrue("Studentul care are restanta este marcat ca nu are restanta",student.areRestante());
		
	}
	@Test
	public void testNuAreRestante()
	{
		Student student= new Student();
		student.adaugaNota(6);
		student.adaugaNota(10);
		assertFalse("Studentul care are restanta este marcat ca are restanta",student.areRestante());
		
	}
	@Test
	public void testAdaugaNota()
	{
		Student student= new Student();
		student.adaugaNota(10);
		assertEquals(1, student.getNote().size());
	}
	@Test
	public void testNotaAdaugataCorecta()
	{
		Student student= new Student();
		int nota =10;
		student.adaugaNota(nota);
		assertEquals(nota, student.getNota(0));
		
	}
	@Test 
	public void testCalculeazaMedie()
	{
		Student student= new Student();
		student.adaugaNota(5);
		student.adaugaNota(6);
		assertEquals(5.5, student.calculeazaMedie(),0.01);
		
	}
	@Test
	public void testCalculeazaMedieFaraNote()
	{
		Student student= new Student();
		assertEquals(0, student.calculeazaMedie(),0.01);
	}
	@Test
	public void testCalculeazaMedieONota()
	{Student student= new Student();
	int nota=8;
	student.adaugaNota(nota);
	assertEquals(nota, student.calculeazaMedie(),0.01);
	}
	@Test
	public void testAdaugaNotaIncorecta()
	{Student student= new Student();
	int nota=14;
	//1
	try {//2
		student.adaugaNota(nota);
		//3
		fail("Nu trebui sa ajunga aici.Metoda trebuia sa arunce o exceptie");
		
	}
	catch (IllegalArgumentException err) {
		// TODO: handle exception
		//4
	}
		//5
	
	}
	@Test (expected = IllegalArgumentException.class)
	public void testAdaugaNotaIncorectaJU4() {
		Student student= new Student();
		int nota=14;
		student.adaugaNota(14);
		
	}
}
