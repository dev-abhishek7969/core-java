package com.abhi.future.dosomedev;

import java.util.concurrent.CompletableFuture;

public class ThrowErrorExample implements Runnable {

	@Override
	public void run() {
		System.out.println("Example with one future that throw an exception.");
		CompletableFuture<Integer> future1 = CompletableFuture.supplyAsync(() -> {
			throw new RuntimeException("Some error message.");
		});
		
		future1.exceptionally(ex ->{
			System.out.println("Exception: "+ex.getMessage());
			return 0;
		});

	}

}
