package string.app;

public class Flag {
	private String location;
	private int noOfColor;
	private String price;
	
	public Flag()
	{
		System.out.println("invoking flag");
	}
	
	public Flag(String location , int noOfColor,String price)
	{
		this.location=location;
		this.noOfColor=noOfColor;
		this.price=price;
	}

	@Override
	public String toString() {
		return "Flag [location=" + location + ", noOfColor=" + noOfColor + ", price=" + price + "]";
	}

}
