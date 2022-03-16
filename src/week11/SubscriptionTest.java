package week11;

import org.junit.*;
import static org.junit.Assert.*;

public class SubscriptionTest {
	
	@Test
	public void test_returnDollar() {
		System.out.print("Test if pricePerMonth returns Dollars...");
		Subscription S = new Subscription(2020, 2);
		System.out.println(S.pricePerMonth());
		assertEquals(S.pricePerMonth(), 10.1, .001);
		// delta - the maximum delta between expected and actual 
		// for which both numbers are still considered equal.
	}
	
	@Test
	public void test_roundUp() {
		System.out.println("Test if pricePerMonth rounds up correctly..."); 
		Subscription S = new Subscription(200,3);
		System.out.println(S.pricePerMonth());
		assertEquals (S.pricePerMonth(), 0.67, .001);
	}
}
