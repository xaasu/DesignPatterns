package memento;

/**
 * The Class Storage.
 */
public class Storage {

	/** The memento. */
	private Memento memento;

	/**
	 * Gets the memento.
	 *
	 * @return the memento
	 */
	public Memento getMemento() {
		return memento;
	}

	/**
	 * Sets the memento.
	 *
	 * @param memento
	 *            the new memento
	 */
	public void setMemento(Memento memento) {
		this.memento = memento;
	}

	/**
	 * Instantiates a new storage.
	 *
	 * @param memento
	 *            the memento
	 */
	public Storage(Memento memento) {
		super();
		this.memento = memento;
	}

}
