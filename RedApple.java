package exercise4_6;

public class RedApple extends Apple{

	private int weight;
	private String color;
	
	public RedApple(String name, int quantity, double price, int weight, String color) {
		super(name,quantity,price);
		this.weight = weight;
		this.color = color;
	
	}
	public int getWeight() {
		return this.weight;
	}

	public String getColor() {
		return this.color;
	}
		
	public int Weight() {
		return weight  * super.getQuantity() ;
	}
	public String TotalWeight() {
		return "Total weight of Red apples: " + Weight();
	}
	
	public String toString() {
		return "Red Apple color is: ";
	}
	
	public void summary() {
		System.out.println(toString() + getColor());
		System.out.println(TotalWeight() + "g");
		
}
}
