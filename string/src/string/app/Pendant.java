package string.app;

public class Pendant {
	private String price;
	
	private String shape;
	private int width;
	private int length;
	private String  design;
	private boolean good;
	private String color;
	private String quality;
	private String shapeName;
	private String use;
	private float cost;
	public Pendant() {
		super();
		
	}
	public Pendant(String price, String shape, int width, int length, String design, boolean good, String color,
			String quality, String shapeName, String use, float cost) {
		super();
		this.price = price;
		this.shape = shape;
		this.width = width;
		this.length = length;
		this.design = design;
		this.good = good;
		this.color = color;
		this.quality = quality;
		this.shapeName = shapeName;
		this.use = use;
		this.cost = cost;
	}
	@Override
	public String toString() {
		return "Pendant [price=" + price + ", shape=" + shape + ", width=" + width + ", length=" + length + ", design="
				+ design + ", good=" + good + ", color=" + color + ", quality=" + quality + ", shapeName=" + shapeName
				+ ", use=" + use + ", cost=" + cost + "]";
	}
	
	

}
