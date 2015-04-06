package ua.natl.sample.customer;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.util.tracker.ServiceTracker;
import ua.natl.sample.customer.implementation.MenuServiceImpl;
import ua.natl.sample.service.implementation.SampleServiceImpl;

public class Activator implements BundleActivator {

	private ServiceTracker<Object, Object> tracker;

	public void start(BundleContext context) throws Exception {
		System.out.println("Customer started!");

		// Create and open tracker
		tracker = new ServiceTracker<Object, Object>(context,
				SampleServiceImpl.class.getName(), null);
		tracker.open();

		// Create customer service
		MenuServiceImpl menu = new MenuServiceImpl(tracker);

		// Execute the sample
		menu.getPrintHello();
	}

	public void stop(BundleContext context) throws Exception {
		// Close the SampleServiceImpl ServiceTracker
		tracker.close();
		System.out.println("Customer stopped.");
	}

}
