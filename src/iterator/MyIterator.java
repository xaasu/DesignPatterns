package iterator;

/**
 * The Class MyIterator.
 */
public class MyIterator implements Iterator {

	/** The collection. */
	private Collection collection;

	/** The post. */
	private int pos = -1;

	/**
	 * Instantiates a new my iterator.
	 *
	 * @param collection
	 *            the collection
	 */
	public MyIterator(Collection collection) {
		this.collection = collection;
	}

	/**
	 * previous
	 * 
	 * @see iterator.Iterator#previous()
	 */
	@Override
	public Object previous() {
		if (pos > 0) {
			pos--;
		}
		return collection.get(pos);
	}

	/**
	 * next
	 * 
	 * @see iterator.Iterator#next()
	 */
	@Override
	public Object next() {
		if (pos < collection.size() - 1) {
			pos++;
		}
		return collection.get(pos);
	}

	/**
	 * hasNext
	 * 
	 * @see iterator.Iterator#hasNext()
	 */
	@Override
	public boolean hasNext() {
		if (pos < collection.size() - 1)
			return true;
		return false;
	}

	/**
	 * first
	 * 
	 * @see iterator.Iterator#first()
	 */
	@Override
	public Object first() {
		pos = 0;
		return collection.get(pos);
	}

}
