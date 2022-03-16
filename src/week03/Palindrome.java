package week03;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Please input your potentional string: ");
		String o = input.nextLine();
//		o = o.toLowerCase();
		StringBuffer sb = new StringBuffer(o);
		sb = sb.reverse();
		String t = sb.toString();
		
		if(o.contentEquals(t)) {
			System.out.println(o + " is a palindrome");
		}else {
			System.out.println(o + " is not a palindrome");
		}
		input.close();
	}

}
