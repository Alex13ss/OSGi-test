package ua.natl.sample.hello.internal;

public class MyThread extends Thread {

	private volatile boolean active = true;

	public void run() {
		while (active) {
			System.out.println("Hello OSGi console");
			try {
				Thread.sleep(5800);
			} catch (Exception e) {
				System.out.println("Thread interrupted " + e.getMessage());
			}
		}
	}

	public void stopThread() {
		active = false;
	}

}
