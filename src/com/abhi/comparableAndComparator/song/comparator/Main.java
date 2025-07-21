package com.abhi.comparableAndComparator.song.comparator;

import java.util.ArrayList;
import java.util.Collections;

import com.abhi.comparableAndComparator.song.Song;

public class Main {

	public static void main(String[] args) {
		ArrayList<Song> list = new ArrayList<>();
		
		Song s1 = new Song("Title1", "Aelly", 2015);
		Song s2 = new Song("Title2", "Ellie", 2011);
		
		list.add(s1);
		list.add(s2);

		Collections.sort(list, new SortByArtist());
		list.forEach(a-> {
			System.out.println(a);
		});

		Collections.sort(list, new SortByYear());
		list.forEach(a-> {
			System.out.println(a);
		});

	}

}
