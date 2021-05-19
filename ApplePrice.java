package exercise4_6;

 class ApplePrice implements Price {

	 double Aprice = 1.70; //quantity below 100
	 double AAprice = 1.40; // quantity more than 100
	 
	 public double totprice(double quantity) {
		 return Aprice * quantity;
	 }
	 
	 public double totprice(double discount, double quantity) {
		 return (AAprice * quantity)* (1-discount);
	 }
}
 
 class RedApplePrice implements Price {
	 
	 double Rprice = 1.80; // quantity below 100
	 double RRprice = 1.45; // quantity more than 100
	 
	 public double totprice(double quantity) {
		 return Rprice * quantity;
	 }
	 
	 public double totprice(double discount, double quantity) {
		 return (RRprice * quantity)* (1-discount);
	 }
	 }
 
class GreenApplePrice implements Price {
	 
	 double Gprice = 1.90; // quantity below 100
	 double GGprice = 1.55; // quantity more than 100
	 
	 public double totprice(double quantity) {
		 return Gprice * quantity;
	 }
	 
	 public double totprice(double discount, double quantity) {
		 return (GGprice * quantity)* (1-discount);
	 }
	 }
