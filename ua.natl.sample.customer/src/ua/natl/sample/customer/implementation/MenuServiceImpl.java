package ua.natl.sample.customer.implementation;

import org.osgi.util.tracker.ServiceTracker;
import ua.natl.sample.customer.MenuService;
import ua.natl.sample.service.implementation.SampleServiceImpl;

public class MenuServiceImpl implements MenuService {

	private final ServiceTracker<?, ?> sampleTracker;

	public MenuServiceImpl(ServiceTracker<?, ?> tracker) {
		sampleTracker = tracker;
	}

	@Override
	public void getPrintHello() {
		SampleServiceImpl service = (SampleServiceImpl) sampleTracker
				.getService();
		if (service == null) {
			System.out.println("Oops... You didn't get it!");
		}
		service.printHello("Customer-bundle");
	}

}
