package com.thread;

public class ImplementRunnable {

	public static void main(String[] args) {
		MyThread1 mth11 = new MyThread1();
		Thread t1 = new Thread(mth11, "AK");
		t1.start();
		Thread t = Thread.currentThread();
		for (int i = 100; i < 110; i++) {
			System.out.println(t.getName() + " - value is:" + i);
		}
		try {
			Thread.sleep(500);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

class MyThread1 implements Runnable {

	@Override
	public void run() {
		Thread th = Thread.currentThread();
		for (int i = 0; i < 10; i++) {
			System.out.println(th.getName() + "- value is:" + i);
		}
		try {
			Thread.sleep(500);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
