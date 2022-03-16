package in_class_test_1;

import java.util.Scanner;

public class A {
	
//		int a=10, b=4, c=9;
//		   do {       b--;       a++;       b-=2;       b=c;          c++ ; 
//		   System.out.println("A");}
//		   while (b>1 && c<10);
//		   
//		   int a = 8, b = 2;
//		   if ((a = 2) == b)    
//		           System.out.print(b); 
//		   else {  
//		    b=b+1;   System.out.print(b); 
//		   } 
//		String variable = "australia";         
//		variable.toUpperCase();       
//		String v2 = variable.replace('A', '$');  /* replace(char old, char new) Returns new  string resulting from replacing all occurrences of  old in string with new*/
//		v2 =  "great-".toUpperCase() + v2 ;   
//		System.out.println(v2);
//		
//		String x = "xyz";           /* Line 1 */
//		x.toUpperCase();         /* Line 2 */
//		String y = x.replace('Y','M');    /* Line 3 -replace(char oldChar, char newChar) Returns a  new string resulting from replacing all occurrences of oldChar in this string with newChar */
//		y = y + "abc";   /* Line 4 */
//		System.out.println(y); /* Line 5 */
//		Scanner in = new Scanner(System.in);
//		   
//		  System.out.print("Input a number: ");
//		  int num1 = in.nextInt();
//		   
//		  for (int i=0; i< 10; i++){
//		   System.out.println(num1 + " x " + (i+1) + " = " + 
//		     (num1 * (i+1)));
//		  }
		
		public static int exA(int i) { 		// we will use method name "exA" to extract hundred unit into a single number (aNUM)
			int aNUM;
			aNUM = i / 100 % 10; 			// as a result, we will get the single digit from "hundred" unit
			return aNUM;
		}

		public static int exB(int i) {      // we will use method name "exB" to extract ten unit into a single number (bNUM)
			int bNUM;
			bNUM = i / 10 % 10; 			// as a result, we will get the single digit from "ten" unit
			return bNUM;
		}

		public static int exC(int i) {      // we will use method name "exC" to extract one unit into a single number (bNUM)
			int cNUM;
			cNUM = i % 10; 					// as a result, we will get the single digit from "one" unit
			return cNUM;
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int i = 0;
			int total = 0; 					
			int aNUM;
			int bNUM;
			int cNUM;
			int sum;

			for (i = 100; i < 1000; i++) { // we have to consider all number from range 100 to 999 
				
				aNUM = exA(i); // using method exA to extract hundred unit
				bNUM = exB(i); // using method exB to extract ten unit
				cNUM = exC(i); // using method exC to extract one unit
				
				sum = (aNUM * aNUM * aNUM) + (bNUM * bNUM * bNUM) + (cNUM * cNUM * cNUM); // sum of cube number from each unit that we had extracted
																				//     this sum can be any number but to be the daffodils number
																				//    , the number must equal to sum of cube number in each unit.
				
				if (sum == i) { // if the number is equal to sum, this means it is the daffodils number.
								// when the daffodils number is proved to be true, we will print out this number 
	                			// and continue the loop to find the next daffodils number until "i" is greater than 1000
					
					total = total + 1; 			// **added extra step that can help in counting how many daffodils numbers in total 
												// if we found the daffodils number, increase the count by 1

					
					System.out.println("Diffodills number is " +  i ); // print out the daffodils number

				}

			}
			System.out.println("The total Diffodills numbers in this loop are " + total + " numbers"); // after "i" has exceed the condition
		}
	

}	
