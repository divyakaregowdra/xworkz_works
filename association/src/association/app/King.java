package association.app;

public class King {
	public String kingdomName;
	public int noOfWifes;
	public int noOfSon;
	public King (String kingname,int noOfWifes,int noOfSon)
	{
		this.kingdomName=kingname;
		this.noOfWifes=noOfWifes;
		this.noOfSon=noOfSon;
	}
	public void printinfo(){
		System.out.println("kingName" + this.kingdomName);
		System.out.println("noOfWifes + this.noOfWifes");
		System.out.println("knoOfSons" + this.noOfSon);
		
	}
	

}
