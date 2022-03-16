package week02;

class calcPay {
/* medium programming problem for lesson2  - 2.3 - Control structures*/

/*
Program to calculate and display the gross weekly pay for an employee.

Type 1 employee, (i.e. a factory worker) is paid 8.50 per hour with
time and half paid for hours over 40 and double time paid for hours
over 60 per week.

A Type 2 employee, (i.e. a speciality worker) is paid 11.50 per hour with
double time paid for hours over 40 per week.

A Type 3 employee, (i.e. a supervisor) is paid 12.00 per hour with double time
paid for hours over 37.5 per week.

*/

// Constants:
   public static final String FACTORY_WORKER_LBL = "factory worker";
   public static final String SPECIALITY_WORKER_LBL = "speciality worker";
   public static final String SUPERVISOR_LBL = "supervisor";

   public static final int FACTORY_WORKER    = 1;
   public static final int SPECIALITY_WORKER = 2;
   public static final int SUPERVISOR        = 3;

   public static final double FACTORY_WAGE = 8.50;
   public static final double SPECIALITY_WAGE = 11.50;
   public static final double SUPERVISOR_WAGE = 12.00;


   public static void main(String[] args) {

       int employeeType;
       double weeklyHours, totalGrossPay, worker_wage;
       String worker_lbl;

       /* set values */
       employeeType = FACTORY_WORKER;    // employee type
       worker_lbl = FACTORY_WORKER_LBL;  // used to display results
       worker_wage = FACTORY_WAGE;       // used to display results

       weeklyHours = 65;                 // hours worked this week
       totalGrossPay = 0;                // initialize the gross pay

       // decide what type of employee and calc wage as per overtime rules.
       switch (employeeType) {

           case FACTORY_WORKER:
              if (weeklyHours <= 40) {
                  totalGrossPay = FACTORY_WAGE * weeklyHours;
              } else {
                  if (weeklyHours <= 60) {
                      totalGrossPay = FACTORY_WAGE * 40 + FACTORY_WAGE*1.5*(weeklyHours - 40);
                  } else {
                     totalGrossPay = FACTORY_WAGE * 40 + FACTORY_WAGE * 1.5 * 20 + FACTORY_WAGE * 2 * (weeklyHours - 60);
                  }
              }
              break;

           case SPECIALITY_WORKER:
              if (weeklyHours <= 40) {
                  totalGrossPay = SPECIALITY_WAGE * weeklyHours;
              } else {
                  totalGrossPay = SPECIALITY_WAGE * 40 + SPECIALITY_WAGE*2*(weeklyHours - 40);
              }
              break;

           case SUPERVISOR:
              if (weeklyHours <= 37.5) {
                  totalGrossPay = SUPERVISOR_WAGE * weeklyHours;
              } else {
                  totalGrossPay = SUPERVISOR_WAGE * 37.5 + SUPERVISOR_WAGE*2*(weeklyHours - 37.5);
              }
              break;

           default:
              System.out.println("Invalid Employee Type!");
              break;
       }
       System.out.println("Gross pay for a " + worker_lbl + " who worked " + weeklyHours + " hours at $ "+worker_wage+" per hour is $ " + totalGrossPay);
   }
}
