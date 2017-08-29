package iterator;

/**
 * The Interface Collection.
 */
public interface Collection {

	/**
	 * Iterator.
	 *
	 * @return the iterator
	 */
	Iterator iterator();

	/**
	 * Gets the.
	 *
	 * @param i
	 *            the i
	 * @return the object
	 */
	Object get(int i);

	/**
	 * Size.
	 *
	 * @return the int
	 */
	int size();
}
