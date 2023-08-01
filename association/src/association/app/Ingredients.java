package association.app;

public class Ingredients {
    public String name;
	public double quantity;
	public double cost;

	public Ingredients(String name, double quantity, double cost) {

		this.name = name;
		this.quantity = quantity;
		this.cost = cost;
	}

	public void ingredientsMethod() {
		System.out.println("Name Of Ingredients: " + name);
		System.out.println("Quantity: " + quantity);
		System.out.println("Cost: " + cost);
	}
}


