package exercise4_6;

public class Apple extends Fruit {
	private int quantity; 
	private double price, discount;

	
	
	
		
		public Apple (String name, int quantity,double price) {
			super(name);
			this.quantity = quantity;
			this.price = price;
			
			Price aapple = new ApplePrice();
			Price redapple = new RedApplePrice();
			Price greenapple = new GreenApplePrice();
		
			if (this.quantity <= 10) {
				double totprice = price * quantity;
				
				System.out.println("Price Less than 10 Apples");
				System.out.println("Total Price : RM" + totprice);
				
			}
			 //totprice(double quantity)
			else if((this.quantity > 10) && (this.quantity <= 100)) {
				
			if (name.equals("Apple")) {
				
				System.out.println("Price More than 10 Apples");
				System.out.println("Total Price : RM" + aapple.totprice(quantity));
			}
			else if (name.equals("Honey Crisp")) {
				
				System.out.println("Price More than 10 Apples");
				System.out.println("Total Price : RM" + redapple.totprice(quantity));
			}
			else if (name.equals("Crispin")) {
				
				System.out.println("Price More than 10 Apples");
				System.out.println("Total Price : RM" + greenapple.totprice(quantity));
			}
			else {
				
			//totprice(double quantity, double discount)
				 if (name.equals("Apple")) {
					 System.out.println("Price More than 100 Apples, You will receive discount price");
					 Discount apple = new AppleDiscount();
					 System.out.println("Total Discount :" + apple.DiscountRate());
				 discount = apple.DiscountRate();
					 System.out.println("Total Price : RM" + aapple.totprice(price, quantity));
					 				 
				 }
				 
				 else if (name.equals("Honey Crisp")) {
					 System.out.println("Price More than 100 Red Apples, You will receive discount price");
					 Discount rapple = new RedAppleDiscount();
					 System.out.println("Total Discount :" + rapple.DiscountRate());
				 discount = rapple.DiscountRate();
				 System.out.println("Total Price : RM" + redapple.totprice(price, quantity));
				 }
				 
				 else if (name.equals("Crispin")) {
					 System.out.println("Price More than 100 Green Apples, You will receive discount price");
					 Discount gapple = new GreenAppleDiscount();
					 System.out.println("Total Discount :" + gapple.DiscountRate());
				 discount = gapple.DiscountRate();
				 System.out.println("Total Price : RM" + greenapple.totprice(price, quantity));
				 }
			}
			}
			}
		
		
		
		public int getQuantity() {
			return this.quantity;
		}
		
		public String toString() {
			return "Total Quantity sold : ";
		}

		public void summary() {
			System.out.println(toString() + getQuantity());
		}
}
