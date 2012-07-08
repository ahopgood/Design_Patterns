package com.alexander.threading.runnable;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BasicRunnable implements Runnable {

	private static Logger LOGGER = LoggerFactory.getLogger(BasicRunnable.class);
	private int runLoopMax = 0;
	
	//Keep the task (Runnable) away from the execution (Thread)
	
	public BasicRunnable(int runLoopMax){
		this.runLoopMax = runLoopMax;
	}
	
	@Override
	public void run() {
		int i = 0;
		while (i < runLoopMax){
			LOGGER.debug("On {} loop number {}",BasicRunnable.class.getSimpleName(), i);
			i++;
		}
	}
}
