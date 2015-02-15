package com.jaewoo.test.thread;


class PrintTwoMessage {
	static void print(String message1, String message2) {
		System.out.print(message1);
		
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		System.out.println(message2);
	}
}

public class PrintThread implements Runnable {
	private String message1;
	private String message2;
	private Thread thread;
	
	public PrintThread(String message1, String message2) {
		this.message1 = message1;
		this.message2 = message2;
		
		thread = new Thread(this);
		thread.start();
	}

	public void run() {
		PrintTwoMessage.print(message1, message2);
	}		
}