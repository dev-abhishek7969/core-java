package com.abhi.failFastAndFailSafe;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class FailSafeExample {

	public static void main(String[] args) {
		ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<>();

		map.put(1, "key1");
		map.put(2, "key2");
		map.put(3, "key3");

		Iterator<Integer> itr = map.keySet().iterator();
		while (itr.hasNext()) {
			Integer key = itr.next();
			System.out.println(key);
			if (key.equals(1)) {
				map.put(1, "key11");
			}

		}
		
		map.entrySet().stream().forEach( a -> {
			System.out.println(a.getKey()+"---"+a.getValue());
		});

	}

}
