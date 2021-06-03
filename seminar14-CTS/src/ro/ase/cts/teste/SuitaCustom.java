package ro.ase.cts.teste;

import org.junit.experimental.categories.Categories.ExcludeCategory;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import ro.ase.cts.teste.categorii.TesteGetPromovabilitate;
import ro.ase.cts.teste.categorii.TesteNormale;

@RunWith(Suite.class)

@SuiteClasses({ TestGrupa.class, TestGrupaWithDummy.class, TestGrupaWithFake.class,
		TestGrupaWithStub.class })

@IncludeCategory(TesteGetPromovabilitate.class)
@ExcludeCategory(TesteNormale.class)
public class SuitaCustom {
}

