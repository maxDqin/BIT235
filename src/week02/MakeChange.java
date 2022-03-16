package week02;

class MakeChange {

/* challenging programming problem for lesson2 - 2.5 - Control structures*/
/*
  This program generates CHANGE to return


*/

    public static final String BILL_20_NAME = "twenty";
    public static final String BILL_10_NAME = "ten";
    public static final String BILL_5_NAME = "five";

    public static final String COIN_200_NAME = "2 dollars";
    public static final String COIN_100_NAME = "1 dollar";
    public static final String COIN_25_NAME = "25 cents";
    public static final String COIN_10_NAME = "10 cents";
    public static final String COIN_5_NAME = "5 cents";
    public static final String COIN_1_NAME = "cents - :) mmmm...It's understood ... I can keep them !";

    public static final double BILL_20_VALUE = 20;
    public static final double BILL_10_VALUE = 10;
    public static final double BILL_5_VALUE = 5;

    public static final double COIN_200_VALUE = 2;
    public static final double COIN_100_VALUE = 1;
    public static final double COIN_25_VALUE = 0.25;
    public static final double COIN_10_VALUE = 0.10;
    public static final double COIN_5_VALUE = 0.05;
    public static final double COIN_1_VALUE = 0.01;

    public static void main(String[] args) {

        double purchase, tender, change, tempChange;
        int bill20, bill10, bill5, coin200, coin100, coin25, coin10, coin5, coin1;

        /* set these */
        purchase = 2.32;
        tender = 20;


        // initialize values
        change = 0;
        tempChange = 0;

        bill20 = 0;
        bill10 = 0;
        bill5  = 0;
        coin200 = 0;
        coin100 = 0;
        coin25 = 0;
        coin10 = 0;
        coin5  = 0;
        coin1  = 0;

        change = tender - purchase;
        tempChange = change;

        while (tempChange >= BILL_20_VALUE) {
            tempChange = tempChange - BILL_20_VALUE;
            ++bill20;
        }
        while (tempChange >= BILL_10_VALUE) {
            tempChange = tempChange - BILL_10_VALUE;
            ++bill10;
        }
        while (tempChange >= BILL_5_VALUE) {
            tempChange = tempChange - BILL_5_VALUE;
            ++bill5;
        }
        while (tempChange >= COIN_200_VALUE) {
            tempChange = tempChange - COIN_200_VALUE;
            ++coin200;
        }
        while (tempChange >= COIN_100_VALUE) {
            tempChange = tempChange - COIN_100_VALUE;
            ++coin100;
		}
        while (tempChange >= COIN_25_VALUE) {
            tempChange = tempChange - COIN_25_VALUE;
            ++coin25;
        }
        while (tempChange >= COIN_10_VALUE) {
            tempChange = tempChange - COIN_10_VALUE;
            ++coin10;
        }
        while (tempChange >= COIN_5_VALUE) {
            tempChange = tempChange - COIN_5_VALUE;
            ++coin5;
        }
        // round off error corrections required
        while ((tempChange +0.001) >= COIN_1_VALUE) {
            tempChange = tempChange - COIN_1_VALUE;
            ++coin1;
        }

        System.out.println("Amount Purchased = $ "+purchase+" and Amount Tendered = "+tender);

        if (bill20 > 0) {
            System.out.println(bill20 + " - "+BILL_20_NAME+" dollar bill(s)");
        }
        if (bill10 > 0) {
            System.out.println(bill10 + " - "+BILL_10_NAME+" dollar bill(s)");
        }
        if (bill5 > 0) {
            System.out.println(bill5 + " - "+BILL_5_NAME+" dollar bill(s)");
        }
        if (coin200 > 0) {
            System.out.println(coin200 + " - "+COIN_200_NAME+" coin(s)");
        }
        if (coin100 > 0) {
            System.out.println(coin100 + " - "+COIN_100_NAME+" coin(s)");
        }
        if (coin25 > 0) {
            System.out.println(coin25 + " - "+COIN_25_NAME+" coin(s)");
        }
        if (coin5 > 0) {
            System.out.println(coin5 + " - "+COIN_5_NAME+" coin(s)");
        }
        if (coin1 > 0) {
            System.out.println(coin1 + " - "+COIN_1_NAME+" :) ");
        }
        System.out.println("Total change is "+change);

    }
}
