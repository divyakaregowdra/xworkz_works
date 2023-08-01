package association.boot;

import association.app.Jail;
import association.app.King;
import association.app.Palace;

public class kingRunner {
	public static void main(String[] args) {
		System.out.println("invoking");
		String kingdomName="Mysour";
		 int noOfWifes=2;
		 int noOfSons=2;
		 
		 String location="mysour";
			 int yearOfConstruct=1873;
			String[] kings= {"Raja1","Raja2"};
			Palace palace=new Palace(location, yearOfConstruct, kings);
					palace.printinfo();
			King king=new King(kingdomName, noOfWifes, noOfSons);
			king.printinfo();
	}

}
