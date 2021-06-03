package ro.ase.cts.teste;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import ro.ase.cts.student.Grupa;
import ro.ase.cts.student.Student;
import ro.ase.cts.teste.categorii.TesteGetPromovabilitate;

public class TestGrupa {

	private Grupa grupa ;
	
	@Before
	public void Setup()
	{
		grupa = new Grupa(1077);
		for(int i=0;i<10;i++) {
		Student studnet1= new Student("Marcel");
		studnet1.adaugaNota(5);
		studnet1.adaugaNota(10);
		studnet1.adaugaNota(4);
		grupa.adaugaStudent(studnet1);
	}}
	
	@Test
	@Category (TesteGetPromovabilitate.class)
	public void testGetPromovabilitateRight()
	{
		Student studentMarcel = new Student("Marcel");
		studentMarcel.adaugaNota(10);
		studentMarcel.adaugaNota(10);
		Student studentMaria = new Student("Maria");
		studentMaria.adaugaNota(10);
		studentMarcel.adaugaNota(10);
		
		grupa.adaugaStudent(studentMarcel);
		grupa.adaugaStudent(studentMaria);
		assertEquals(0.16,grupa.getPromovabilitate(),0.05);
		
	}
	
	@Test
	@Category (TesteGetPromovabilitate.class)
	public void testGetPromovabilitateLowerBoundery()
	{
		assertEquals(0, grupa.getPromovabilitate(), 0.05);
	}
	
	@Test
	@Category (TesteGetPromovabilitate.class)
	public void testGetPromovabilitateUpperBoundery()
	{ Grupa grupaNoua= new Grupa(1076);
	
	    Student student1= new Student("Ion");
	    student1.adaugaNota(10);
	    student1.adaugaNota(10);
	    Student student2= new Student("Ana");
	    student2.adaugaNota(10);
	    student2.adaugaNota(10);
	    
	    grupaNoua.adaugaStudent(student1);
	    grupaNoua.adaugaStudent(student2);
		
	
		assertEquals(1, grupaNoua.getPromovabilitate(), 0.05);
	}
	
	@Test( expected = IllegalArgumentException.class)

	public void testGetPromovabilitate() 
	{
		Grupa grupaNoua = new Grupa(1080);
		grupaNoua.getPromovabilitate();
		
	}
	@Test(timeout = 500)
	public void testGetPromovabilitatePerformance()
	
	{
		grupa.getPromovabilitate();
	}
	@Test
	public void testConstructorRight() {
		
		Grupa grupa= new Grupa(1076);
	    assertEquals(1076, grupa.getNrGrupa());	
	}

	@Test
	public void testLimitaInferioara() {
		int nrGrupa=1000;
		Grupa grupa= new Grupa(nrGrupa);
	    assertEquals(nrGrupa, grupa.getNrGrupa());	
	}
	@Test
	public void testLimitaSuperioara() {
		int nrGrupa=1100;
		Grupa grupa= new Grupa(nrGrupa);
	    assertEquals(nrGrupa, grupa.getNrGrupa());	
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testConstrcutorErrorMaiMic() {
		int nrGrupa=100;
		Grupa grupa= new Grupa(nrGrupa);
	    
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testConstrcutorErrorMaiMare() {
		int nrGrupa=1000000;
		Grupa grupa= new Grupa(nrGrupa);
	    
	}
	@Test(timeout=500)
	public void testConstructorPerformance()
	{
		Grupa grupa = new Grupa(1077);
		
	}
	
	@Test
	public void testConstructorexistence()
	{
		Grupa grupa = new Grupa (1076);
		assertNotNull(grupa.getStudenti());
	}
	
}
