package exercise4_6;


	class AppleDiscount implements Discount {
		public float DiscountRate() {
		return 0.25f;
		}
	}
		 class RedAppleDiscount implements Discount {
			public float DiscountRate() {
				return 0.30f;
			}
		 }	
		 class GreenAppleDiscount implements Discount {
			public float DiscountRate() {
				return 0.35f;
			}
		
}
