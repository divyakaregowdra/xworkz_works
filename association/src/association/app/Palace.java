package association.app;

public class Palace {
	public String location;
	public int yearOfConstruct;
	public String[] kings;
	
	public Palace(String location,int yearOfConstruct,String[] king)
	{
		this.location=location;
		this.yearOfConstruct=yearOfConstruct;
		this.kings=king;
	}
	
	public void printinfo(){
		System.out.println("location:" + this.location);
		System.out.println("yearOfConstruct:" + this.yearOfConstruct);
		System.out.println("kings:" + this.kings);
		
	}

}
