package state;

/**
 * The Class State.
 */
public class State {
	
	/** The value. */
	private String value;

	/**
	 * Gets the value.
	 *
	 * @return the value
	 */
	public String getValue() {
		return value;
	}

	/**
	 * Sets the value.
	 *
	 * @param value the new value
	 */
	public void setValue(String value) {
		this.value = value;
	}

	/**
	 * Method 1.
	 */
	public void method1() {
		System.out.println("execute the first opt!");
	}

	/**
	 * Method 2.
	 */
	public void method2() {
		System.out.println("execute the second opt!");
	}
}
