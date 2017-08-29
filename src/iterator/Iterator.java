package iterator;

/**
 * The Interface Iterator.
 */
public interface Iterator {

	/**
	 * Previous.
	 *
	 * @return the object
	 */
	Object previous();

	/**
	 * Next.
	 *
	 * @return the object
	 */
	Object next();

	/**
	 * Checks for next.
	 *
	 * @return true, if successful
	 */
	boolean hasNext();

	/**
	 * First.
	 *
	 * @return the object
	 */
	Object first();
}
