package week03;

public class StringBufferDemo {
	public static void main(String[] args) {
		// Example 1
//		String A1 = "Hello "; 
//		String B1 = "There "; 
//		StringBuffer sb1 = new StringBuffer(A1); 
//		sb1 = sb1.append(B1); 
//		System.out.println(sb1.toString());
		
		// Example 2
//		String A2 = "Hello There";
//		String B2 = " Over     ";
//		StringBuffer sb2 = new StringBuffer(A2);
//		sb2.insert(5,B2);
//		System.out.println(sb2.toString());
//
//		//Example 3
		String A3 = "Hello";
		StringBuffer sb3 = new StringBuffer(A3);
		sb3 = sb3.reverse();
		System.out.println(sb3.toString());

	}
}
