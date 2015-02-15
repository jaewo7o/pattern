package com.jaewoo.test.thread;

import org.apache.log4j.Logger;

public class SimpleThread extends Thread {
	private Logger LOG = Logger.getLogger(SimpleThread.class);
	
	public SimpleThread(String name) {
		super(name);
	}
	
	public void run() {
		for (int i=0; i<5; i++) {
			LOG.debug(i + " " + getName() + ", Priority : " + getPriority());
			//try {
			//	sleep((long)Math.random() * 10000);
			//} catch (InterruptedException e) {
			//	LOG.error("Interrupt Error", e);
			//}
		}
		
		LOG.debug("Done!!! " + getName());
	}
}
