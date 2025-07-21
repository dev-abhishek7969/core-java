package com.abhi.failFastAndFailSafe;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailSafeExample1 {

	public static void main(String[] args) {

		List<String> list = new CopyOnWriteArrayList<>();
		list.add("Abhishek");
		list.add("Amit");
		list.add("Manish");
		list.add("Vedant");

		Iterator<String> itr = list.iterator();

		while (itr.hasNext()) {
			String name = (String) itr.next();
			if(name.equals("Vedant"))
			list.add("Shivang");

		}
		System.out.println(list);

	}

}
