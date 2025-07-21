package com.abhi.InheritanceMultiple;

public class Test implements Left, Right {

	public static void main(String[] args) {
		new Test().m1();
	}

	@Override
	public void m1() {
		Left.super.m1();
		Right.super.m1();
	}

}
