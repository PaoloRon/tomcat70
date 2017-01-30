package org.apache.naming;

public class NamingServiceStates {

	/**
	 * Status constants.
	 */
	private static final String[] states = 
	{"Stopped", "Stopping", "Starting", "Started"};

	public static String[] getStates() {
		return states;
	}

}
