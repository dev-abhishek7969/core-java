package com.abhi.future;

public class FutureDemoProblemStmt {

	public static void main(String[] args) {

		long startTime = System.currentTimeMillis();
		FutureDemoProblemStmt obj = new FutureDemoProblemStmt();
		String s1 = obj.getFirstName();// blocking queue
		String s2 = obj.getLastName();// blocking queue
		String fullName = s1 + s2;
		System.out.println(fullName);
		System.out.println("Time taken = " + (System.currentTimeMillis() - startTime));
	}

	public String getFirstName() {
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		return "Abhishek ";
	}

	public String getLastName() {
		return "Kumar";
	}

}
