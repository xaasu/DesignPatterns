package iterator;

/**
 * The Class IteratorTest.<br>
 * <b>迭代子模式</b>:
 * 迭代器模式就是顺序访问聚集中的对象,这句话包含两层意思：一是需要遍历的对象，即聚集对象，二是迭代器对象，用于对聚集对象进行遍历访问。
 */
public class IteratorTest {

	/**
	 * The main method.
	 *
	 * @param args
	 *            the arguments
	 */
	public static void main(String[] args) {
		Collection collection = new MyCollection();
		Iterator it = collection.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
