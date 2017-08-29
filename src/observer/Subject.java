package observer;

/**
 * The Interface Subject.
 */
public interface Subject {

	/**
	 * Adds the.
	 *
	 * @param observer
	 *            the observer
	 */
	void add(Observer observer);

	/**
	 * Del.
	 *
	 * @param observer
	 *            the observer
	 */
	void del(Observer observer);

	/**
	 * Notify.
	 */
	void notifyObserver();

}
