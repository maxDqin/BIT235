package week04;

import java.util.Scanner;

public class P7_JavaRevision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int userInput; // defining an integer variable
		String x = "Hello World!\n"; // defining string variable
		Scanner console = new Scanner(System.in); // to take INPUT
		userInput = console.nextInt();
		if (userInput > 5) { // if statement
			for (int i = 1; i <= 5; i++) { // for loop
				System.out.println("String is : " + x + (i));
			}
			int i = 1;
			while (i <= 5) { // while loop
				System.out.println("String is : " + x + (i));
				i++;
			}
		}

	}

}
