package adapter.objectadapter;

import adapter.Source;
import adapter.Targetable;

/**
 * The Class ObjectAdapter.
 */
public class ObjectAdapter implements Targetable {

	/** The source. */
	private Source source;

	/**
	 * method1.
	 *
	 * @see adapter.Targetable#method1()
	 */
	@Override
	public void method1() {
		this.source.method1();
	}

	/**
	 * method2.
	 *
	 * @see adapter.Targetable#method2()
	 */
	@Override
	public void method2() {
		System.out.println("Target method : method2 !");
	}

	/**
	 * Instantiates a new object adapter.
	 *
	 * @param source
	 *            the source
	 */
	public ObjectAdapter(Source source) {
		super();
		this.source = source;
	}

	/**
	 * Gets the source.
	 *
	 * @return the source
	 */
	public Source getSource() {
		return source;
	}

	/**
	 * Sets the source.
	 *
	 * @param source
	 *            the new source
	 */
	public void setSource(Source source) {
		this.source = source;
	}

}
