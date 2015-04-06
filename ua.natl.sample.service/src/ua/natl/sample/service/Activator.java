package ua.natl.sample.service;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;
import ua.natl.sample.service.implementation.SampleServiceImpl;

public class Activator implements BundleActivator {

	public ServiceRegistration<?> registration;

	public void start(BundleContext context) throws Exception {

		// create a service
		SampleService service = new SampleServiceImpl();

		// registrating the SampleServiceImpl
		registration = context.registerService(
				SampleServiceImpl.class.getName(), service, null);
		System.out.println("Service is registered!");
	}

	public void stop(BundleContext context) throws Exception {
		registration.unregister();
		System.out.println("Service unregistered.");
	}

}
