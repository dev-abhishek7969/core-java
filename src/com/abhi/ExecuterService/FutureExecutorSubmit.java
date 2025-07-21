package com.abhi.ExecuterService;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FutureExecutorSubmit {

	public static void main(String[] args) {
		try {

			Callable<String> task = () -> "Avocado";

			ExecutorService service = Executors.newFixedThreadPool(5);
			Future<String> result = service.submit(task);

			while (true) {
				if (result.isDone()) {
					System.out.println(result.get());
					break;
				}
			}

		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}
