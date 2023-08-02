package inheritance.app;

public class FourthLevel  extends Hierarchy {
	String bikeName;
	public void bike(String bikeName) 
	{

	
		System.out.println("Invoke the no-arg in singleLevel");
		this.bikeName=bikeName;
		System.out.println("bikeName is "+this.bikeName);
	}

}

