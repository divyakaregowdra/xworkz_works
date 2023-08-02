package inheritance.boot;

import inheritance.app.EightLevel;
import inheritance.app.FifthLevle;
import inheritance.app.FourthLevel;
import inheritance.app.Hierarchy;
import inheritance.app.SecondLevel;
import inheritance.app.SeventhLevel;
import inheritance.app.SingleLevel;
import inheritance.app.SixthLevel;
import inheritance.app.ThirdLevel;


public class HierarchyRunner {
	public static void main(String[] args) {
		System.out.println("invoking main in th runner");
		Hierarchy hierarchy0=new Hierarchy();
		hierarchy0.Material("electric");
		Hierarchy hierarchy1=new SingleLevel();
		hierarchy1. Chakra("circle");
		Hierarchy hierarchy2=new SecondLevel();
		hierarchy2.bullockCart("bull");
		Hierarchy hierarchy3=new ThirdLevel();
		hierarchy3. bicycle("bird");
		Hierarchy hierarchy4=new FourthLevel();
		hierarchy4.bike("Hero") ;
		Hierarchy hierarchy5=new FifthLevle();
		hierarchy5.Auto("black") ;
		Hierarchy hierarchy6=new SixthLevel();
		hierarchy6.Tax(" brand");
		Hierarchy hierarchy7=new SeventhLevel();
		hierarchy7.Car("Maruthi");
		Hierarchy hierarchy8=new EightLevel();
		hierarchy8.Van ("Long");
	}

}
