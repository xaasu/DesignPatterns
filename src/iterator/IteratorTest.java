package iterator;

/**
 * The Class IteratorTest.<br>
 * <b>������ģʽ</b>:
 * ������ģʽ����˳����ʾۼ��еĶ���,��仰����������˼��һ����Ҫ�����Ķ��󣬼��ۼ����󣬶��ǵ������������ڶԾۼ�������б������ʡ�
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
