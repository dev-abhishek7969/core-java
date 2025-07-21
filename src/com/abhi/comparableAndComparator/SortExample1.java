package com.abhi.comparableAndComparator;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortExample1 {

	public static void main(String[] args) {
		int arr[] = { 199, 23, 2, 67, 78, 12 };
		Arrays.sort(arr);

		List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
		System.out.println(list);

	}

}
