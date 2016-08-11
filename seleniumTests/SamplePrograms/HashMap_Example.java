package SamplePrograms;

import java.util.*;

public class HashMap_Example {

	public static void main(String[] args) {

		Map<String, Integer> hashMap = new HashMap<>();
		hashMap.put("Adams", 27);
		hashMap.put("James", 12);
		hashMap.put("Zenith", 13);
		hashMap.put("Lancer", 45);
		
		//System.out.println(hashMap.get("Adams"));
		for(String name : hashMap.keySet()){
			//System.out.println(name + " ");
			System.out.println(name + " - " +hashMap.get(name));
		}
	}

}
