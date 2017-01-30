package org.apache.tomcat.util.net;

public class SSLCiphers {

	/**
	 * A mapping table to determine the number of effective bits in the key
	 * when using a cipher suite containing the specified cipher name.  The
	 * underlying data came from the TLS Specification (RFC 2246), Appendix C.
	 */
	 private final static SSLSupport.CipherData ciphers[] = {
	    new SSLSupport.CipherData("_WITH_NULL_", 0),
	    new SSLSupport.CipherData("_WITH_IDEA_CBC_", 128),
	    new SSLSupport.CipherData("_WITH_RC2_CBC_40_", 40),
	    new SSLSupport.CipherData("_WITH_RC4_40_", 40),
	    new SSLSupport.CipherData("_WITH_RC4_128_", 128),
	    new SSLSupport.CipherData("_WITH_DES40_CBC_", 40),
	    new SSLSupport.CipherData("_WITH_DES_CBC_", 56),
	    new SSLSupport.CipherData("_WITH_3DES_EDE_CBC_", 168),
	    new SSLSupport.CipherData("_WITH_AES_128_CBC_", 128),
	    new SSLSupport.CipherData("_WITH_AES_256_CBC_", 256)
	};

	private SSLCiphers() {
		super();
	}

	public static SSLSupport.CipherData[] getCiphers() {
		return ciphers;
	}

}
