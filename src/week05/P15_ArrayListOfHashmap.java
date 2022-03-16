package week05;

import java.util.*;

public class P15_ArrayListOfHashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<HashMap> theArrayofMAP= new ArrayList<HashMap>();
		HashMap m1 = new HashMap(); 
		m1.put("id", 8);
		m1.put("name", "Smith");
		m1.put("address", "Melbourne");
		m1.put("phone", "92698412");

		theArrayofMAP.add(m1);
		
		for(int i=0; i<theArrayofMAP.size(); i++)
			for(Object key : theArrayofMAP.get(i).keySet()) {
				System.out.println(key.toString() + ":" + theArrayofMAP.get(i).get(key));
			}
		
	}

}
