package week05;

import java.io.FileReader;

public class P27_File {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
//			FileReader fr = new FileReader("lect.ppt");
			FileReader frr = new FileReader("./src/week06/Test.java");
							
				// code for when everything is OK

			} catch (java.io.FileNotFoundException e) {
				// code for when things go wrong
				System.out.println("Exception thrown: " + e);
			}

	}

}
