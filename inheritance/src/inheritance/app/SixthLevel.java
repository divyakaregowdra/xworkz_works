package inheritance.app;

public class SixthLevel extends Hierarchy{
	String brand;
	
		public void Tax(String brand) {
			System.out.println("Invoke the no-arg in singleLevel");
			this.brand=brand;
			System.out.println("brand is "+this.brand);
		}
	}


