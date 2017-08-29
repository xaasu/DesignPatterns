package memento;

/**
 * The Class Original.
 */
public class Original {

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
	 * Instantiates a new original.
	 *
	 * @param value
	 *            the value
	 */
	public Original(String value) {
		super();
		this.value = value;
	}

	/**
	 * Creates the memento.
	 *
	 * @param value
	 *            the value
	 * @return the memento
	 */
	public Memento createMemento() {
		System.out.println("Current state saved , value is " + value);
		return new Memento(value);
	}

	/**
	 * Restore memento.
	 *
	 * @param memento
	 *            the memento
	 */
	public void restoreMemento(Memento memento) {
		System.out.println("Before restore value is " + value);
		this.value = memento.getValue();
		System.out.println("After restore value is " + value);
	}
}
