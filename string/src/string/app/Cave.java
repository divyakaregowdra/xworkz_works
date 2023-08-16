package string.app;

public class Cave {
	private String location;
	
	private String name;
	
	private int size;
	private String color;
	
	private int length;
	private int width;
	private String shape;
	private int numberOfPeoples;
	private int numberOfAnimals;
	private String place;
	public Cave() {
		super();
	}
	public Cave(String location, String name, int size, String color, int length, int width, String shape,
			int numberOfPeoples, int numberOfAnimals, String place) {
		super();
		this.location = location;
		this.name = name;
		this.size = size;
		this.color = color;
		this.length = length;
		this.width = width;
		this.shape = shape;
		this.numberOfPeoples = numberOfPeoples;
		this.numberOfAnimals = numberOfAnimals;
		this.place = place;
	}
	@Override
	public String toString() {
		return "Cave [location=" + location + ", name=" + name + ", size=" + size + ", color=" + color + ", length="
				+ length + ", width=" + width + ", shape=" + shape + ", numberOfPeoples=" + numberOfPeoples
				+ ", numberOfAnimals=" + numberOfAnimals + ", place=" + place + "]";
	}
	

}
