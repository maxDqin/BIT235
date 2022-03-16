package week05;

import java.util.Scanner;

public class P33_Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[2];
		int division = 0;
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<arr.length;i++) {
			System.out.println("Please input a["+i+"]");
			arr[i] = sc.nextInt();
		}
		try {
			division = arr[0]/arr[1];
			System.out.print("arr[0]/arr[1]="+division);
		}catch(ArithmeticException e) {
			System.out.println("The denominator is 0!!!");
		}
	}

}
