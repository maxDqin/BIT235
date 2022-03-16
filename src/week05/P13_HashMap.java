package week05;

import java.util.HashMap;

public class P13_HashMap {

	public static void main(String[] args) {
		Math.abs(1);
		// TODO Auto-generated method stub
		HashMap thehashMap = new HashMap();
		thehashMap.put("id", 101);
		thehashMap.put("name", "John");
		thehashMap.put("address", "Sydney");
		thehashMap.put("phone", "(2)12345678");

		System.out.println("Hash Map Elements are");
		System.out.println(thehashMap);
		System.out.println("Hash Map Phone Element is: " + thehashMap.get("phone"));

		System.out.println("------------------------");
		// page14
		for (Object key : thehashMap.keySet()) {
			System.out.println(key.toString() + " : " + thehashMap.get(key));
		}
		// thehashMap.keySet actually returns you all keys [id, name, address, phone]
		// 1st key = id, 101
		// 2nd key = name, John
		// ....
	}

}
