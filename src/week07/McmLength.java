package week07;

/*
Lesson 3 - Exercise 3.7 - class to output boxes.
*/

class McmLength {


    // instance variables
    private int lenMeters;
    private int lenCentimeters;
    private int lenMillimeters;

    // constructors
    public McmLength() {
        lenMeters = 0;
        lenCentimeters = 0;
        lenMillimeters = 0;
    }

    public McmLength(int m, int cm, int mm) {
        lenMeters = m;
        lenCentimeters = cm;
        lenMillimeters = mm;
        reduce();
    }

    public McmLength(double cm) {

        lenCentimeters = (int) cm;
        lenMillimeters = (int) (10*(cm - lenCentimeters));
        lenMeters = 0;
        reduce();
    }

    public McmLength(int mm) {
		lenMillimeters = mm;
		lenCentimeters = 0;
		lenMeters = 0;
		reduce();
	}

    // add two objects
    public McmLength add(McmLength obj) {

        int m = this.lenMeters + obj.getMeters();
        int cm = this.lenCentimeters + obj.getCentimeters();
        int mm = this.lenMillimeters + obj.getMillimeters();

        McmLength retObj = new McmLength(m,cm,mm);
        return retObj;
    }

    // subtract two objects
    public McmLength subtract(McmLength obj) {

        // convert everything to mm
        int m = this.lenMeters*1000 - obj.getMeters()*1000;
        int cm = this.lenCentimeters*10 - obj.getCentimeters()*10;
        int mm = this.lenMillimeters - obj.getMillimeters();

        mm = mm + cm + m;

        McmLength retObj = new McmLength(mm);
        return retObj;
    }

   // multiply by a integer
    public McmLength multiply(int mult) {

        int m = this.lenMeters * mult;
        int cm = this.lenCentimeters * mult;
        int mm = this.lenMillimeters * mult;

        McmLength retObj = new McmLength(m,cm,mm);
        return retObj;
    }

    // divide by a integer
    public McmLength divide(int mult) {

        // first convert to mm
        int m = (int) this.lenMeters * 1000;
        int cm = (int) this.lenCentimeters * 10;
        int mm = (int) this.lenMillimeters;

        mm = m + cm + mm;

        // now divide
        mm = (int)( mm / mult);

        McmLength retObj = new McmLength(mm);
        return retObj;
    }

    // compute area of two objects returns in square mm
    public int area(McmLength obj) {

		int mm1,mm2;
		// convert to mm
		mm1 = lenMeters*1000 + lenCentimeters*10 + lenMillimeters;
		mm2 = obj.getMeters()*1000 + obj.getCentimeters()*10 + obj.getMillimeters();
		int retval = mm1*mm2;
		return retval;
	}

    public int getMeters() {
        return lenMeters;
    }

    public int getCentimeters() {
        return lenCentimeters;
    }

    public int getMillimeters() {
        return lenMillimeters;
    }

    public String toString() {
        String rs = "" + lenMeters+" m, "+lenCentimeters+" cm, "+lenMillimeters+" mm";
        return rs;
    }

    // reduce the cm and mm to lowest possible
    private void reduce() {
        int divisor;

        divisor = (int) (this.lenMillimeters / 10);

        if (divisor > 0) {
            this.lenMillimeters -= divisor*10;
            this.lenCentimeters += divisor;
        }

        divisor = (int) (this.lenCentimeters / 100);

        if (divisor > 0) {
            this.lenCentimeters -= divisor*100;
            this.lenMeters += divisor;
        }
    }
    
    public static void main(String[] args) {

        McmLength o1 = new McmLength(1,71,8);
        McmLength o2 = new McmLength(175.5);
        McmLength o3 = new McmLength(923);

        System.out.println("o1 = " + o1);
        System.out.println("o2 = " + o2);
        System.out.println("o3 = " + o3);

        McmLength oo = o2.add(o1);
        System.out.println("o2 + o1 = "+oo);

        oo = o2.subtract(o1);
        System.out.println("o2 - o1 = "+oo);

        int areaMM = o2.area(o1);
        System.out.println("Area from o1 * o2 = "+areaMM+" square mm");

        oo = o1.multiply(5);
        System.out.println("Multiply o1 by 5 = "+oo);

        oo = o1.divide(5);
        System.out.println("Divide o1 by 5 = "+oo);
    }
}

