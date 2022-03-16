package week05;
import java.util.*;
public class Test {
	public static void main(String args[]) {
		System.out.println((new java.util.Date()).toLocaleString());
		Scanner console = new Scanner(System.in);

        int input = console.nextInt();

       

        for (int i = 0; i < 11; i++) {

        System.out.println(input + " X " + i + " = " + input*i);
	}
	}
}
