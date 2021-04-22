package ro.ase.cts.state.clase;

public class Ocupata implements Stare {

	@Override
	public void schimbaStarea(Masa masa) {
		if(!(masa.getStare() instanceof  Ocupata))
		{
			System.out.println("Ati ocuapt masa cu codul "+masa.getNr());
			masa.setStare(this);
		}
		else 
		{
			System.out.println("Masa este ocuapata sau deja rezervata! ");
		}
		
	}
	

}
