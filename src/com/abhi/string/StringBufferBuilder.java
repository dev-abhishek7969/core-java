package com.abhi.string;

public class StringBufferBuilder {

	public static void main(String[] args) {

		String s1 = new String("String s1");
		String s2 = "String s2";
		
		StringBuilder builder = new StringBuilder("Hello");
		builder.append(" world");
		builder.append(" thanks");
		
		StringBuffer buffer = new StringBuffer("My spring");
		buffer.append(" project");
		
		System.out.println(builder);
		System.out.println(buffer);
	}

}
