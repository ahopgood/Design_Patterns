package com.alexander.threading.thread;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BasicThread extends Thread {

	private static Logger LOGGER = LoggerFactory.getLogger(BasicThread.class);
	private int threadLoopMax = 0;
	
	public BasicThread(int threadLoopMax){
		this.threadLoopMax = threadLoopMax;
	}
	
	public void run(){
		int i = 0;
		while (i < threadLoopMax){
			LOGGER.debug("On {} loop number {}", BasicThread.class.getSimpleName(), i );
			i++;
		}
	}
}
