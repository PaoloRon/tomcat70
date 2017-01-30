package org.apache.naming;

public class NamingServiceStates {

	/**
	 * Status constants.
	 */
	private static final String[] states = 
	{"Stopped", "Stopping", "Starting", "Started"};

	private NamingServiceStates() {
		super();
	}

	public static String[] getStates() {
		return states;
	}

}
