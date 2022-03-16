package week05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.HashMap;
public class Week05 {

	public static void main(String[] args) {
		Circle c1 =  new Circle("Big Boy","Red",100);
		c1.setName("Square");
		c1.displayProperties();
		c1.setName("circle");
		c1.displayProperties();
		
		
		System.out.println(c1.getRadius());
		HashMap<String,String> people = new HashMap<String,String>();
		people.put("IT", "John");
		people.put("Business", "Mary");
		people.put("Humanities", "Paul");
		for (Object k : people.keySet()){
			System.out.println(k + " : " + people.get(k));
		}
		System.out.println(people.get("IT"));
		System.out.println(people.get("Business"));
		System.out.println(people.containsKey("Engineering"));

			
			
		ArrayList<String> counters =  new ArrayList<String>();
		counters.add("first string");
		counters.add("sec string");
		counters.add("third string");
		counters.add("100");
		for(String s : counters){
			System.out.println(s);
		}
		System.out.println(counters.size());
		counters.remove(2);
		System.out.println(counters.size());
		System.out.println("__________");
		Collections.sort(counters);
		System.out.println(counters.toString());
		
		ArrayList<Object> flexible = new ArrayList<Object>();
		flexible.add(100);
		flexible.add("I'm letters and symbols");
		flexible.add(100.23);
		System.out.println(flexible.get(1));
		System.out.println(flexible.get(0));
		
		String[] a = new String[2];
		a[0]= "first";
		a[1]= "second";
		String[] b = {"a","b","c","d","e"};
		System.out.println(a[0]);
		System.out.println(b[0]);

	}

}
