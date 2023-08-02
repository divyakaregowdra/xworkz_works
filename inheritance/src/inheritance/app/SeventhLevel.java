package inheritance.app;

public class SeventhLevel extends Hierarchy{
	String brand;
	public void Car(String brand)
	{
		System.out.println("invoking no args in level");
		this.brand=brand;
		System.out.println("brand is"+ brand);
			
		}
	}
	


