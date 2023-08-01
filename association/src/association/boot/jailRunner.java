package association.boot;

import association.app.Jail;

public class jailRunner {
	public static void main(String[] args) {
		System.out.println("invoking");
		String jailName="Bellary jail";
		String[] noOfCriminalsName= {"veerappan","Bin ladan"};
		int [] noOfCells= {10,50,150};
		
		Jail jail=new Jail(jailName, noOfCriminalsName, noOfCells);
		jail.printInfo();
		
			
		

	}

}
