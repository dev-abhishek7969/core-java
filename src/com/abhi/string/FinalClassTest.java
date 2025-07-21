package com.abhi.string;

import java.util.ArrayList;
import java.util.List;

public class FinalClassTest {

	public static void main(String[] args) {
		List<String> token = new ArrayList<>();
		token.add("active token");
		FinalClass fc = new FinalClass("abhishek", 001, token);

		System.out.println(fc.getToken());

		fc.getToken().add("inactive token");
		System.out.println(fc.getToken());
	}

}
