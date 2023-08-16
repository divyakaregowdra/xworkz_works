package string.app;

public class Karchief {
private int price;
private char size;
private String colour;
private String shape;
private String design;
private String use;
private String length;
public Karchief() {
	super();
}
public Karchief(int price, char size, String colour, String shape, String design, String use, String length) {
	super();
	this.price = price;
	this.size = size;
	this.colour = colour;
	this.shape = shape;
	this.design = design;
	this.use = use;
	this.length = length;
}
@Override
public String toString() {
	return "Karchief [price=" + price + ", size=" + size + ", colour=" + colour + ", shape=" + shape + ", design="
			+ design + ", use=" + use + ", length=" + length + "]";
}


}
