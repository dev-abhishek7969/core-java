package com.abhi.future;

import java.util.concurrent.CompletableFuture;

public class CompletableFutureDemo {

	public static void main(String[] args) throws InterruptedException {
		
		CompletableFutureDemo obj = new CompletableFutureDemo();
		
		CompletableFuture<String> c1 = CompletableFuture.supplyAsync(() -> obj.getFirestName());
		CompletableFuture<String> c2 =CompletableFuture.supplyAsync(() -> obj.getLastName());
		
		//combining these two Completable future
		
		String finalResult = c1.thenCombine(c2, (s1,s2)-> s1+" "+s2).join();
		System.out.println(finalResult);
		
		Thread.sleep(5000);// main thread doing some other task, which completable result is obtained. 

	}
	
	
	public String getFirestName() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}  
		return "Abhishek ";
	}
	
	public String getLastName() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return "kumar ";
	}

}
