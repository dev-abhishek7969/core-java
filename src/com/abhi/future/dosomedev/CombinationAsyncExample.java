package com.abhi.future.dosomedev;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CombinationAsyncExample implements Runnable {

	@Override
	public void run() {
		System.out.println("Example with two futures with combined result.");

		CompletableFuture<Integer> future1 = CompletableFuture.supplyAsync(() -> {
			try {
				Thread.sleep(1000);
				return 10;
			} catch (InterruptedException e) {
				throw new RuntimeException(e);
			}
		});

		CompletableFuture<Integer> future2 = CompletableFuture.supplyAsync(() -> {
			try {
				Thread.sleep(2000);
				return 20;
			} catch (InterruptedException e) {
				throw new RuntimeException(e);
			}
		});
		
		CompletableFuture<Integer> futureResult = future1.thenCombine(future2, (x,y) -> x+y);
		
		System.out.println("Before combining future");
		
		try {
			Integer result = futureResult.get();
			System.out.println("Combined future "+result);
		} catch (InterruptedException |ExecutionException ex) {
			System.out.println("Combined future error msg "+ex.getMessage());
		} 
		System.out.println("After combining future");

	}

}
