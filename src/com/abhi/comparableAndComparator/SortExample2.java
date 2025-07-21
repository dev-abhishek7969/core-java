package com.abhi.comparableAndComparator;

import java.util.ArrayList;
import java.util.Collections;

public class SortExample2 {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>();
		list.add(98);
		list.add(12);
		list.add(34);
		list.add(56);
		Collections.sort(list);
		System.out.println(list);
	}

}
