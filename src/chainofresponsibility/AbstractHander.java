package chainofresponsibility;

/**
 * The Class AbstractHander.
 */
public class AbstractHander {

	/** The handler. */
	private Handler handler;

	/**
	 * Gets the handler.
	 *
	 * @return the handler
	 */
	public Handler getHandler() {
		return handler;
	}

	/**
	 * Sets the handler.
	 *
	 * @param handler
	 *            the new handler
	 */
	public void setHandler(Handler handler) {
		this.handler = handler;
	}

}
