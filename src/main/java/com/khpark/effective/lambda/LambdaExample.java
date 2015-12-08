package com.khpark.effective.lambda;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class LambdaExample {
	public void runnableExample() {
		Runnable r = ()->System.out.println("# Runnable Test : hello, world!");
		r.run();
	}
	
	public void listExample() {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
		System.out.print("# List style 1 : ");
		list.forEach(n -> System.out.print(n));
		
		System.out.println();
		
		System.out.print("# List style 2 : ");
		list.forEach(System.out::print);
	}
	
	public void mapExample() {
		Map<String, String> map = new HashMap<String, String>();
		map.put("name", "khpark");
		map.put("company", "tmon");
		map.put("age", "38");
		
		System.out.println();
		System.out.print("# Map : ");
		
		Set<Entry<String, String>> set = map.entrySet();
		set.forEach(n -> System.out.print(n + " "));
	}

}
