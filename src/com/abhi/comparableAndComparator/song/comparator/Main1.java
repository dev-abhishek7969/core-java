package com.abhi.comparableAndComparator.song.comparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

import com.abhi.comparableAndComparator.song.Song;

public class Main1 {

	public static void main(String[] args) {
		ArrayList<Song> list = new ArrayList<>();

		Song s1 = new Song("ram", "Aelly", 2015);
		Song s2 = new Song("bob", "Ellie", 2011);

		list.add(s1);
		list.add(s2);

		// Will sort in ASC order
		Comparator<Song> songComAsc = Comparator.comparing(Song::getTitle);

		Collections.sort(list, songComAsc);
		list.forEach(a -> {
			System.out.println(a);
		});
		System.out.println("******************************");
		Comparator<Song> songComDesc = (Song a1, Song a2) -> s2.getTitle().compareTo(s1.getTitle());
		Collections.sort(list, songComDesc);
		list.forEach(a -> {
			System.out.println(a);
		});
		System.out.println("******************************");
		Collections.sort(list, songComAsc.reversed());
		list.forEach(a -> {
			System.out.println(a);
		});

		System.out.println("******************************");
		Collections.sort(list,(o1,o2)->o1.getArtist().compareTo(o2.getArtist()));

	}

}
