package ro.ase.cts.teste;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ TestGrupa.class,TestGrupaWithDummy.class, TestGrupaWithFake.class, TestGrupaWithStub.class })
public class AllTests {

}
