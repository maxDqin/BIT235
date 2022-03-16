package week02;

class perfectSqr {
/* easy programming problem for lesson2 - 2.2 - Control statements*/

/* This program displays all the perfect squares between 1 and 100 */

   public static void main(String[] args) {
       int testroot;

       for (int i = 1; i <= 100; i++) {

           testroot = (int) Math.sqrt(i);
           if (testroot*testroot == i) {
              System.out.println(i + " is a perfect square");
           }
       }
   }
}
