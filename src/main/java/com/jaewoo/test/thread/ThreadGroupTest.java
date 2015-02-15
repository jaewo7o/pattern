package com.jaewoo.test.thread;

import org.apache.log4j.Logger;


public class ThreadGroupTest {
	private static Logger LOG = Logger.getLogger(ThreadGroupTest.class);

	public static void main(String[] args) {
		
		new SimpleThread("Boston").start();
		new SimpleThread("New York").start();
		new SimpleThread("Seoul").start();

		LOG.debug("Thread 1 !!!!!");
		printThreadInfo(findCurrentThreads());
		LOG.debug("Thread 2 !!!!!");
		printThreadInfo(findAllThreads());
	}
	
	public static void printThreadInfo(Thread[] threads) {
		LOG.debug("Thread Size : " + threads.length);
		StringBuffer logString = new StringBuffer();
		for (int i=0; i<threads.length; i++) {
			logString.append("Thread name : ").append(threads[i].getName());
			logString.append(", Thread group name : ").append(threads[i].getThreadGroup().getName());
			logString.append("\n");
		}
		
		LOG.debug(logString.toString());				
	}
	
	public static Thread[] findCurrentThreads() {
		ThreadGroup group = Thread.currentThread().getThreadGroup();
		LOG.debug("Number of active threads in this thread group = " + group.activeCount());
		
		Thread[] stackList = new Thread[10];
		int actualSize = group.enumerate(stackList);
		
		Thread[] list = new Thread[actualSize];
		
		System.arraycopy(stackList, 0, list, 0, actualSize);
		
		return list;
	}
		
	public static Thread[] findAllThreads() {
		ThreadGroup topThreadGroup = null;
		ThreadGroup threadGroup = Thread.currentThread().getThreadGroup();
		
		while (threadGroup != null) {
			topThreadGroup = threadGroup;
			threadGroup = threadGroup.getParent();
		}
		
		LOG.debug("Number of active threads in this thread group = " + topThreadGroup.activeCount());
		int estimatedSize = topThreadGroup.activeCount() * 2;
		Thread[] stackList = new Thread[estimatedSize];
		int actualSize = topThreadGroup.enumerate(stackList);
		LOG.debug("Actual Size : " + actualSize);
		
		Thread[] list = new Thread[actualSize];
		System.arraycopy(stackList, 0, list, 0, actualSize);
		
		return list;
	}
	
}