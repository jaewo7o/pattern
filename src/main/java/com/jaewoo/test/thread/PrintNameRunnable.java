package com.jaewoo.test.thread;

import org.apache.log4j.Logger;

public class PrintNameRunnable implements Runnable {
	private Logger LOG = Logger.getLogger(PrintNameRunnable.class);
	
	private String name;
	
	public PrintNameRunnable(String name) {
		this.name = name;
	}

	public void run() {
		for (int i=0; i<10; i++) {
			LOG.debug("Name : " + this.name);
		}
	}
}
