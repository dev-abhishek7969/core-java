package com.abhi.comparableAndComparator.song;

import java.util.ArrayList;
import java.util.Collections;

public class App {

	public static void main(String[] args) {
		ArrayList<Song> list = new ArrayList<>();
		
		Song s1 = new Song("Title1", "Nelly", 2015);
		Song s2 = new Song("Title2", "Ellie", 2011);
		
		list.add(s1);
		list.add(s2);
		
		
		// Collections is not applicable for the arguments (ArrayList<Song>)
		//The object which are sorting should implement comparable intefrace
		Collections.sort(list);
		list.forEach(a-> {
			System.out.println(a);
		});
	}

}
