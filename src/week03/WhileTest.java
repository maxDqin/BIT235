package week03;

public class WhileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean done = false;
		int x, y;
		x = 1;
		y = 2;
		while (!done) {
			x = x * 2;
			y = y + 100;
			System.out.println("==== x = " + x + " and y = " + y);
			if (x > y) {
				done = true;
			}
		}
		System.out.println("x = " + x + " and y = " + y);

	}

}
