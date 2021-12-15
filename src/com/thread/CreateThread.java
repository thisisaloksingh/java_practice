package com.thread;

import java.util.Comparator;

public class CreateThread implements Comparator<String> {
	public static void main(String[] args) {
		MyThread mth1 = new MyThread("AK-0");
		MyThread mth2 = new MyThread("AK-1");
		mth1.start();
		mth2.start();
		Thread t = Thread.currentThread();
		for (int i = 100; i < 110; i++) {
			mth1.setName("AK-01");
			//public final void setName(String name);
			System.out.println(mth1.getName() + " - value is :" + i);
			//public final string getName();
		}
		try {
			Thread.sleep(500);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public int compareTo(String o) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		return 0;
	}

}

class MyThread extends Thread {
	public MyThread(String string) {
		super(string);
	}

	@Override
	public void run() {
		Thread th = Thread.currentThread();
		for (int i = 0; i < 10; i++) {
			System.out.println(th.getName() + " - value is :" + i);
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
