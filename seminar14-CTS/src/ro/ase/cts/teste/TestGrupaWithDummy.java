package ro.ase.cts.teste;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import ro.ase.cts.dubluri.StudentDummy;
import ro.ase.cts.student.Grupa;
import ro.ase.cts.student.IStudent;
import ro.ase.cts.teste.categorii.TesteGetPromovabilitate;

public class TestGrupaWithDummy {
	@Test
	@Category (TesteGetPromovabilitate.class)
	public void testAdaugaStudenti() {
		IStudent student = new StudentDummy();
		Grupa grupa = new Grupa(1076);
		grupa.adaugaStudent(student);
		assertEquals(1, grupa.getStudenti().size());
	}
}
