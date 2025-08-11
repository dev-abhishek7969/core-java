package com.abhi.future;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class BlockingSolution {

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		long startTime = System.currentTimeMillis();
		BlockingSolution obj = new BlockingSolution();

		Callable<String> fnameCallable = new Callable<String>() {

			@Override
			public String call() throws Exception {
				System.out.println("Called for first name " + Thread.currentThread().getName());
				String fname = obj.getFirstName();
				return fname;
			}
		};

		Callable<String> lNameCallable = new Callable<String>() {

			@Override
			public String call() throws Exception {
				System.out.println("Called for last name " + Thread.currentThread().getName());
				String lName = obj.getLastName();
				return lName;
			}

		};

		ExecutorService es = Executors.newFixedThreadPool(2);

		Future<String> r1 = es.submit(fnameCallable);
		Future<String> r2 = es.submit(lNameCallable);

		String firstName = r1.get();// Again this is a blocking
		String lastName = r2.get();// Again this is a blocking

		String fullName = firstName + lastName;

		System.out.println("Full name is " + fullName);
		System.out.println("Time taken to execute " + (System.currentTimeMillis() - startTime));

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

		return "Kumar ";
	}

}
