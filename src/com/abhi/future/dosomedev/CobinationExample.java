package com.abhi.future.dosomedev;

import java.util.concurrent.CompletableFuture;

public class CobinationExample implements Runnable{

	@Override
	public void run() {
		System.out.println("Example with twp completable Future that are combined:");
		
		CompletableFuture<String> future1 = CompletableFuture.supplyAsync(() ->{
			return "hello";
		});
		 
		CompletableFuture<String> future2 = CompletableFuture.supplyAsync(() ->{
			return "my friend.";
		});

		CompletableFuture<String> futureCombined = future1.thenCombine(future2, (s1,s2) ->{
			return s1+" "+s2;
		});
		
		futureCombined.thenAccept(System.out::println);

	}

}
