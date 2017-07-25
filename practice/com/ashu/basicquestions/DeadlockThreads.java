package com.ashu.basicquestions;

public class DeadlockThreads {
	String s1 = "ashu";
	String s2 = "shree";
	Thread t1 = new Thread("my Thread 1") {
		public void run() {
			synchronized (s1) {
				System.out.println("s1-t1");
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				synchronized (s2) {
					System.out.println("s2-t1");
				}
			}
		}
	};
	Thread t2 = new Thread("my Thread 2") {
		public void run() {
			synchronized (s2) {
				System.out.println("s2-t2");
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				synchronized (s1) {
					System.out.println("s1-t2");
				}
			}
		}
	};

	public static void main(String[] args) {
		DeadlockThreads dt = new DeadlockThreads();
		dt.t1.start();
		dt.t2.start();
	}
}