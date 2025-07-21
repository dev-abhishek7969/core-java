package com.abhi.string;

import java.util.ArrayList;
import java.util.List;

public final class FinalClass {

	private final String name;
	private final Integer id;
	private final List<String> token;

	public FinalClass(String name, Integer id, List<String> token) {
		this.name = name;
		this.id = id;
		this.token = token;
	}

	public String getName() {
		return name;
	}

	public Integer getId() {
		return id;
	}

	public List<String> getToken() {
		return new ArrayList<>(token);
	}
}


