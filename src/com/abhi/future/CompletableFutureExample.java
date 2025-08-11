package com.abhi.future;

import java.util.concurrent.CompletableFuture;

public class CompletableFutureExample {

	public static void main(String[] args) throws InterruptedException {

		CompletableFutureExample obj = new CompletableFutureExample();


		CompletableFuture.runAsync(() -> obj.getName()).thenAccept(str -> System.out.println(str));

		System.out.println("Done.");// main thread is released.

		Thread.sleep(5000);// main thread doing some other task, which completable result is obtained.

	}

	public String getName() {
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return "Abhishek ";
	}

}
