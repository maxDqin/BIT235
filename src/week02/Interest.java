package week02;

class Interest {

/* medium programming problem for lesson2 */

/* This program calulates compounded interest */

   public static void main (String [] args) {

         float rate, amount, principle, periods;

         rate = 4;                      // 4% interest rate per annum
         principle = 5000.0f;           // investment
         periods = 10;                  // earning interest for 10 years;

         amount = (float)(principle*Math.pow((1.0 + rate/100.0),periods));

         System.out.println("An investment of $ "+principle+" invested at "+rate+"% for "+periods+" years is $ "+amount);


   }
}