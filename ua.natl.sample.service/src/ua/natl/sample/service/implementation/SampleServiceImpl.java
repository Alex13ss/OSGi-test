package ua.natl.sample.service.implementation;

import ua.natl.sample.service.SampleService;

public class SampleServiceImpl implements SampleService {

	private static final String NAME = SampleServiceImpl.class.getName();

	@Override
	public String getName() {
		return NAME;
	}

	public void printHello(String sender) {
		System.out.printf("\tHello, %s!\n", sender);
	}

}
