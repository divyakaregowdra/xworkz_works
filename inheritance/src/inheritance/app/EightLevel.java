package inheritance.app;

public class EightLevel extends Hierarchy {
	String size;
	public void Van (String size)
	{
		System.out.println("invoking no args in level");
		this.size=size;
		System.out.println("size is"+ size);
			
		}
	}


