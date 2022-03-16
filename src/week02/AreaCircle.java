package week02;

class AreaCircle {

   /* easy programming problem for lesson2 */

   /* program to calculate and display the area of circle */

   static final float pi = 3.14f;     // constant
   public static void main (String [] args) {

      float radius, area;

      radius = 10.0f;

      area = pi*radius*radius;

      System.out.println("The area of a circle with a radius of " + radius + " is " + area);
   }

}