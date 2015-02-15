package com.jaewoo.test.thread;

public class RunnableThreadTest {
	public static void main(String[] args) {
		PrintNameRunnable pr1 = new PrintNameRunnable("A");
		Thread thread1 = new Thread(pr1);
		thread1.start();
		
		PrintNameRunnable pr2 = new PrintNameRunnable("B");
		Thread thread2 = new Thread(pr2);
		thread2.start();
		
		PrintNameRunnable pr3 = new PrintNameRunnable("C");
		Thread thread3 = new Thread(pr3);
		thread3.start();
	}
}
