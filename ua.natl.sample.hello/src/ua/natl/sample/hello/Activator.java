package ua.natl.sample.hello;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

import ua.natl.sample.hello.internal.MyThread;

public class Activator implements BundleActivator {

	private MyThread myThread;

	public void start(BundleContext context) throws Exception {
		System.out.println("Method \"start()\" is called! Hello! :)");
		myThread = new MyThread();
		myThread.start();
	}

	public void stop(BundleContext context) throws Exception {
		System.out.println("Method \"stop()\" is called! Bye!");
		myThread.stopThread();
		myThread.join();
	}

}
