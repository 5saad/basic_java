package com.qa.helloworld;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayTest {

	public static void main(String[] args) {
		
		List<Integer> names = new ArrayList<>();
		
		names.add(5);
		names.add(6);
		names.add(7);
		names.add(2);
		names.add(3);
		
		System.out.println(names);
		
		System.out.println(names.get(0));
		System.out.println(names.get(3));
		
		names.set(1, 4);
		System.out.println(names);
		
		System.out.println(names.size());
		
		for (int i=0 ; i < names.size(); i++) {
			System.out.println(names.get(i));
		}
		
		for (int i : names) {
			System.out.println(i);
		}
		
		Collections.sort(names);
		System.out.println(names);
		
	}
}
