package week05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class P8_Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> theList= new ArrayList<String>();
		//List<String> theList = Arrays.asList(“VIC", “NSW", “SA", //”TAS”);
		
		theList.add("VIC");
		theList.add("NSW");
		theList.add("SA");
		theList.add("TAS");
		theList.remove(0);
		System.out.println(theList.size());
		
		System.out.println("No. of elements in List :");
		for (int i = 0; i < theList.size(); i++)  
		     System.out.println(i + " : " + theList.get(i) + " "); //i=0, VIC, NSW
		
		System.out.println("Size of the List :" + theList.size());//4
		System.out.println("Element at index 1: " + theList.get(1));//NSW
		System.out.println("Elements of array" + theList.toString() + "\n");//[VIC, NSW,.args.]
		Collections.sort(theList);
		System.out.println("Elements of array" + theList.toString());
		
		
	}
	

}
