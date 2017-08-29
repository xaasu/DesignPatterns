package proxy;

/**
 * The Class Source.
 */
public class Source implements Sourceable {

	/** 
	 * method
	 * @see proxy.Sourceable#method()
	 */
	@Override
	public void method() {
		System.out.println("source method!");
	}

}
