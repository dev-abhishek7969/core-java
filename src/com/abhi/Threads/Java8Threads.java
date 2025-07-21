package com.abhi.Threads;

public class Java8Threads {

	public static void main(String[] args) {

		Runnable task = () -> {
			System.out.println("Running thread task " + Thread.currentThread().getName());
		};
		task.run();// will run in main thread, so will get printed first

		new Thread(task).start();// will run by separate thread , so will be printed second
	}

}
