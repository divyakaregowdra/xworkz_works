package inheritance.app;

public class FifthLevle extends Hierarchy{
	String color;
	public void Auto(String color) 
	{

		System.out.println("Invoke the no-arg in singleLevel");
		this.color=color;
		System.out.println("color is "+this.color);
	}

}

