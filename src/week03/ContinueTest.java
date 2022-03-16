package week03;

public class ContinueTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 1;
		boolean done = false;
		while (! done) {
		   x = (int) (Math.random()*10);   // random # 0-9
		   System.out.println("x is :" + x);
		   if (x == 5) {
		     System.out.println("We hit 5");
		     break;
		   }
		   if (x == 9) {
		     System.out.println("Finally we hit 9");
		     done = true; // or u can skip these 2 lines and write break;
		     continue;
		   }
		   System.out.println(x);  // this statement gets skipped when x is 9 or 5
		                           // this is due to continue statement
		}
		System.out.println("We are done here.");
	}

}
