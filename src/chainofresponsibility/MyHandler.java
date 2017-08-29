package chainofresponsibility;

/**
 * The Class MyHandler.
 */
public class MyHandler extends AbstractHander implements Handler {

	/** The name. */
	private String name;

	/**
	 * Instantiates a new my handler.
	 *
	 * @param name
	 *            the name
	 */
	public MyHandler(String name) {
		super();
		this.name = name;
	}

	/**
	 * operation
	 * 
	 * @see chainofresponsibility.Handler#operation()
	 */
	@Override
	public void operation() {
		System.out.println(name + " operator ! ");
		if (getHandler() != null) {
			getHandler().operation();
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
