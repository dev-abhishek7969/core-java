package com.abhi.failFastAndFailSafe;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FailFastExample {

	public static void main(String[] args) {

		List<String> fList = new ArrayList<>();

		fList.add("Mango");
		fList.add("Pineapple");
		fList.add("Bananna");

		Iterator<String> itr = fList.iterator();

		while (itr.hasNext()) {
			String fruit = itr.next().toString();
			System.out.println(fruit);
			if (fruit.equalsIgnoreCase(fruit)) {
				fList.add("Cherry"); // will get java.util.ConcurrentModificationException on update of List
			}

		}
	}

}
