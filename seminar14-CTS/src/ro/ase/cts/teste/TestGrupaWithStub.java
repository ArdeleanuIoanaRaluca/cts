package ro.ase.cts.teste;

import static org.junit.Assert.*;

import org.junit.Test;

import ro.ase.cts.dubluri.StudentStub;
import ro.ase.cts.student.Grupa;
import ro.ase.cts.student.IStudent;

public class TestGrupaWithStub {

	Grupa grupa;
	@Test
	public void testGetPromovabilitate() {
		grupa= new Grupa(1077);
		IStudent s1= new StudentStub();
		
		grupa.adaugaStudent(s1);
		
		assertEquals(1, grupa.getPromovabilitate(), 0.01);
	}


}
