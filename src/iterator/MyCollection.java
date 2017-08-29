package iterator;

/**
 * The Class MyCollection.
 */
public class MyCollection implements Collection {

	/** The string. */
	public String[] string = { "A", "B", "C", "D", "E" };

	/**
	 * iterator
	 * 
	 * @see iterator.Collection#iterator()
	 */
	@Override
	public Iterator iterator() {
		return new MyIterator(this);
	}

	/**
	 * get
	 * 
	 * @see iterator.Collection#get(int)
	 */
	@Override
	public Object get(int i) {
		return string[i];
	}

	/**
	 * size
	 * 
	 * @see iterator.Collection#size()
	 */
	@Override
	public int size() {
		return string.length;
	}

}
