package week02;

class VolSphere {

   /* medium-challenging programming problem for lesson2 */

   /* program to calculate and display the volume of sphere */
   /* In particular calculate the volume of the sun and the earth given
      the diameter of each. Then calculate the ratio  of the two volumes
   */

   static final float pi = 3.14f;     // constant

   public static void main (String [] args) {

      double radius, volume;

      double volumeSun, volumeEarth, volumeRatio;

      double diameterSun = 865000.0;   // as given in the problem
      double diameterEarth = 7600.0;   // as given in the problem

      // first lets calculate the sun's volume

      // radius is half of diameter
      radius = diameterSun/2.0;

      // formala to calculate volume
      volume = 4.0/3.0*pi*Math.pow(radius,3.0);

      volumeSun = volume;

      // now lets calculate the earth's volume

      // radius is half of diameter
      radius = diameterEarth/2.0;

      // formala to calculate volume
      volume = 4.0/3.0*pi*Math.pow(radius,3.0);

      volumeEarth = volume;

      // calculate the ratio of sun's volume to the earth's
      volumeRatio = volumeSun / volumeEarth;

      System.out.println("The volume of the sun is " + volumeSun + " cubic miles");
      System.out.println("The volume of the Earth is " + volumeEarth + " cubic miles");
      System.out.println("The ratio sun's volume to the earth's is " + volumeRatio);

   }

}
