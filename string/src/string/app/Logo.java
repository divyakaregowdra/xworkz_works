package string.app;

public class Logo {

	private String logoName;
	private String colour;
	private String shape;
	private int year;
	private boolean logoGood;
	public Logo() {
		super();
	}
	public Logo(String logoName, String colour, String shape, int year, boolean logoGood) {
		super();
		this.logoName = logoName;
		this.colour = colour;
		this.shape = shape;
		this.year = year;
		this.logoGood = logoGood;
	}
	@Override
	public String toString() {
		return "Logo [logoName=" + logoName + ", colour=" + colour + ", shape=" + shape + ", year=" + year
				+ ", logoGood=" + logoGood + "]";
	}
	
	

}
