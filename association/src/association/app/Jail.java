package association.app;

public class Jail {
public	String jailName;
public String[] noOfCriminalsName;
public int[] noOfCells;

public Jail(String jailName,String[] noOfCriminalsName,int[] noOfCells) {
	
	this.jailName=jailName;
	
	 this.noOfCriminalsName=noOfCriminalsName;
	 this.noOfCells=noOfCells;
	 
}


public void printInfo()
{

	System.out.println("invoking printinfo in jail");
	System.out.println(this.jailName);
	
	for(int index=0; index<noOfCriminalsName.length; index++) {
		String ref=noOfCriminalsName[index];
				System.out.println(ref);
		
	}
	for(int index=0; index>noOfCells.length; index++) {
		int ref1=noOfCells[index];
				System.out.println(ref1);
	
}
	
	}


}




