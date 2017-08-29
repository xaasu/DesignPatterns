package proxy;

/**
 * The Class Proxy.
 */
public class Proxy implements Sourceable {

	/** The source. */
	private Source source;

	/**
	 * method.
	 *
	 * @see proxy.Sourceable#method()
	 */
	@Override
	public void method() {
		before();
		source.method();
		after();
	}

	/**
	 * Before.
	 */
	private void before() {
		System.out.println("before proxy!");
	}

	/**
	 * After.
	 */
	private void after() {
		System.out.println("after proxy!");
	}

	/**
	 * Instantiates a new proxy.
	 */
	public Proxy() {
		super();
		this.source = new Source();
	}

}
