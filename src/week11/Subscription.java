package week11;

public class Subscription {
	private int price; //subscription total price in cents
	private int length; // length of subscription in months
	
	Subscription(int p, int n) {
		price = p;
		length = n;
		
	}
	
	public double pricePerMonth() {
		double r = (double)price / (double)length;
		r = Math.ceil(r);
		return r/100;
	}
	
	public void cancel() {
		length = 0;
	}
	
}
