package ro.ase.cts.program;

import ro.ase.cts.clase.ManagerSpital;
import ro.ase.cts.clase.ManagerSpitalLazy;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    //ManagerSpital n1= new ManagerSpital("n1", 42, 1062);
   // ManagerSpital n2= new ManagerSpital("n2", 52, 2043);
		ManagerSpital m1=ManagerSpital.getInstance();
		ManagerSpital m2=ManagerSpital.getInstance();
		
    
    System.out.println(m1.toString());
    System.out.println(m2.toString());
    
    
    
    ManagerSpitalLazy managerLazy1= ManagerSpitalLazy.getInstance("Gigel", 45, 1223);
    ManagerSpitalLazy managerLazy2= ManagerSpitalLazy.getInstance("Sorina", 50, 5489);
	
    managerLazy1.setVarsta(49);
    managerLazy2.setNume("Ionel");
    
    System.out.println(managerLazy1.toString());
    System.out.println(managerLazy2.toString());
    
	}

}
