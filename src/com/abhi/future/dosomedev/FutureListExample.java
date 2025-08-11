package com.abhi.future.dosomedev;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class FutureListExample implements Runnable {

	@Override
	public void run() {
		System.out.println("Example with a list of future run through another future:");
		
		List<CompletableFuture<String>> futures = Arrays.asList(
				CompletableFuture.supplyAsync(() -> "Future A Result"),
				CompletableFuture.supplyAsync(() -> "Future B Result"),
				CompletableFuture.supplyAsync(() -> "Future C Result")			
		);
		
		CompletableFuture<Void> combinedFuture = CompletableFuture.allOf(
		futures.toArray(new CompletableFuture[0]));
		
		combinedFuture.thenRun(() ->  {
			futures.forEach(future ->{
				try {
					System.out.println("Combined future result "+future.get());
				} catch (InterruptedException | ExecutionException e) {
					System.out.println("Combined future error "+e.getMessage());
				}
			});
		});
		

	}

}
