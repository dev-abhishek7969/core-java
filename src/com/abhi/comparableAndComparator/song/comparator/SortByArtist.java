package com.abhi.comparableAndComparator.song.comparator;

import java.util.Comparator;

import com.abhi.comparableAndComparator.song.Song;

public class SortByArtist implements Comparator<Song>{

	@Override
	public int compare(Song o1, Song o2) {

		return o1.getArtist().compareTo(o2.getArtist());
	}

}
