package state;

/**
 * The Class Context.
 */
public class Context {

	/** The state. */
	private State state;

	/**
	 * Instantiates a new context.
	 *
	 * @param state
	 *            the state
	 */
	public Context(State state) {
		this.state = state;
	}

	/**
	 * Gets the state.
	 *
	 * @return the state
	 */
	public State getState() {
		return state;
	}

	/**
	 * Sets the state.
	 *
	 * @param state
	 *            the new state
	 */
	public void setState(State state) {
		this.state = state;
	}

	/**
	 * Method.
	 */
	public void method() {
		if (state.getValue().equals("state1")) {
			state.method1();
		} else if (state.getValue().equals("state2")) {
			state.method2();
		}
	}
}
