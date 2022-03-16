package week04;

import java.util.StringTokenizer;

public class Exercise3 {
	public static void main(String[] args) {
		/*
		 * Write a program that will reverse the sequence of letters 
		 * in each word of a paragraph of text of your choice. 
		 * For instance, "To be or not to be." Would become "oT eb ro ton ot eb."
		 */

	      String reverseString, tempStr, forwardString;
	      // intialize strings
	      reverseString = "";
	      forwardString = "To be or not to be";

	      // set up string tokenizer
	      StringTokenizer st = new StringTokenizer(forwardString);

	      // take each work and reverse it using a string buffer
	      while (st.hasMoreTokens() ) {
	          tempStr = st.nextToken();
	          StringBuffer sb = new StringBuffer(tempStr);
	          sb.reverse();
	          reverseString = reverseString + sb.toString()+" ";
	      }
	      // output results
	      System.out.println(reverseString);

	   }

}
