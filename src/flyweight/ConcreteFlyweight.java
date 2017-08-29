package flyweight;

/**
 * The Class ConcreteFlyweight.
 */
public class ConcreteFlyweight implements Flyweight {

	/** The str. */
	private String str;

	/**
	 * Instantiates a new concrete flyweight.
	 *
	 * @param str
	 *            the str
	 */
	public ConcreteFlyweight(String str) {
		super();
		this.str = str;
	}

	/**
	 * operation
	 * 
	 * @see flyweight.Flyweight#operation()
	 */
	@Override
	public void operation() {
		System.out.println("ConcreteFlyweight : " + str);
	}

}
