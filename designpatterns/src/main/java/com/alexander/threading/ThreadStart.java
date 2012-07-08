package com.alexander.threading;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.alexander.threading.executors.SimpleExecutor;
import com.alexander.threading.runnable.BasicRunnable;
import com.alexander.threading.thread.BasicThread;

public class ThreadStart {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BasicRunnable basic = new BasicRunnable(10);
		Thread thread = new Thread(basic);
//		thread.start();
		
		BasicThread basicThread = new BasicThread(10);
//		basicThread.start();
		//TODO demonstate the useful thread status messages here
		
		Executor executor = new SimpleExecutor();
		//drop in our runnable classes and call executor.execute(Runnable runnable);
		
		executor.execute(basic);
		executor.execute(basicThread);
		
		List<Runnable> tasks = new LinkedList<Runnable>();
		tasks.add(basic);
		tasks.add(basicThread);
		
		ExecutorService ex = Executors.newFixedThreadPool(3);
//		ex.invokeAll(tasks);
	}

}
