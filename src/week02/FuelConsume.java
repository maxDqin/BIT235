package week02;

class FuelConsume {

/* challenging programming problem for lesson2 */


/*
This program calculates fuel consumption for rough and normal
roads; given the fuel consumption for each type of road.

*/

   public static void main (String [] args) {

       /* what we know */

       double ex_distance = 100;   // how far on normal roads
       double ex_fuel = 8;         // with 8 L of Fuel

       double percent_rough = 15;
       double fuel_in_tank = 40.0;

       /* what we can calculate */
       double distance_normal;
       double distance_rough;        // these all get
       double fuel_consume_normal;   // set to 0
       double fuel_consume_rough;    // by default

       fuel_consume_normal = ex_distance / ex_fuel;

       fuel_consume_rough = ex_distance / (ex_fuel + ex_fuel * percent_rough/100);

       distance_normal = fuel_in_tank * fuel_consume_normal;
       distance_rough = fuel_in_tank * fuel_consume_rough;

       System.out.println("This vehicle can travel " + distance_normal+ " km on normal roads on a full tank of fuel");

       System.out.println("This vehicle can travel " + distance_rough+ " km on rough roads on a full tank of fuel");


   }
}