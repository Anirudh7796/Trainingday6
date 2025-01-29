package com.wiprotrain5;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecuterServcieExample {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		ExecutorService executorService = Executors.newFixedThreadPool(3);
		for (int i = 0; i <= 5; i++) {
			int taskNumber = i;
			executorService.submit(() -> {
 
				System.out.println("Task " + taskNumber + "is running by" + Thread.currentThread().getName());
 
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO: handle exception
					System.out.println("Task " + taskNumber + "was interrupted");
				}
				System.out.println("Task " + taskNumber + "is completed by" + Thread.currentThread().getName());
			}
 
			);
			
		}
		executorService.shutdown();
		System.out.println("all tasks are completed");
	}

}

