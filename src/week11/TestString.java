package week11;

import edu.princeton.cs.algs4.In;
public class TestString {
	/**
	 * 
	 * @param args
	 */
	public static void main(String args[]) {
		In in = new In("./week11/test.txt");
		while(in.hasNextLine()) {
			String s = in.readLine();
			System.out.println(s);
		}
	}
}
