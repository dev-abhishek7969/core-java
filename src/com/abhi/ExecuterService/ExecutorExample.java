package com.abhi.ExecuterService;

import java.time.LocalDateTime;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExecutorExample {

	public static void main(String[] args) {
		ExecutorService es = Executors.newFixedThreadPool(2);

		Runnable runnableTask = () -> {
	        try {
	            TimeUnit.MILLISECONDS.sleep(1000);
	            System.out.println("Ran by "+Thread.currentThread().getName()+" Current time :: " + LocalDateTime.now());
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	    };
	    
	    //1. execute task using execute() method
	    //This works on fire and forget principal
		for (int i = 0; i < 10; i++) {
			es.execute(runnableTask);
		}

		es.shutdown();

	}

}
