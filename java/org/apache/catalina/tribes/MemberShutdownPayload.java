package org.apache.catalina.tribes;

public class MemberShutdownPayload {

	/**
	 * When a member leaves the cluster, the payload of the memberDisappeared member
	 * will be the following bytes. This indicates a soft shutdown, and not a crash
	 */
	private static final byte[] SHUTDOWN_PAYLOAD = new byte[] {66, 65, 66, 89, 45, 65, 76, 69, 88};

	private MemberShutdownPayload() {
		super();
	}

	public static byte[] getShutdownPayload() {
		return SHUTDOWN_PAYLOAD;
	}

}
