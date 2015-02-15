package com.jaewoo.test.thread;


public class SynchronizeThreadTest2 {
	
	/**
	 * Use synchronized statement on a common object
	 * @param args
	 */
	public static void main(String[] args) {
		PrintTwoMessage pm = new PrintTwoMessage(); 
		
		new PrintThread("jaewoo ", "test", pm);
		new PrintThread("heyjin ", "cooking", pm);
		new PrintThread("dasom ", "study", pm);
		new PrintThread("hanbyul ", "painting", pm);
	}
	
	static class PrintTwoMessage {
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

	public static class PrintThread implements Runnable {
		private String message1;
		private String message2;
		private Thread thread;
		private PrintTwoMessage pm;
		
		public PrintThread(String message1, String message2, PrintTwoMessage pm) {
			this.message1 = message1;
			this.message2 = message2;
			this.pm = pm;
			
			thread = new Thread(this);
			thread.start();
		}

		public void run() {
			synchronized (pm) {
				pm.print(message1, message2);
			}
		}		
	}
}