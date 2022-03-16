package week02;

class SumSquares {

   /* easiest programming problem for lesson2 - 2.1 - Program Control Statements */

   /*
   Program to calculate and display the sum of the squares of the first
   100 integers .
   */

    public static final int LAST_INTEGER = 100;   // constant

	public static void main(String[] args) {

		int sum = 0;

		for (int j = 1; j <= LAST_INTEGER; j++) {
		    sum = sum + j*j;
		}
		System.out.println("The sum of the square of the first "+LAST_INTEGER+" integers is " + sum);

	}
}