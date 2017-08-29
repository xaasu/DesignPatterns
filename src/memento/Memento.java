package memento;

/**
 * The Class Memento.
 */
public class Memento {

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
	 * @param value
	 *            the new value
	 */
	public void setValue(String value) {
		this.value = value;
	}

	/**
	 * Instantiates a new memento.
	 *
	 * @param value
	 *            the value
	 */
	public Memento(String value) {
		super();
		this.value = value;
	}

}
