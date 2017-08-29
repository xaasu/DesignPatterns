package observer;

/**
 * The Class ObserverTest.<br>
 * <b>�۲���ģʽ</b>: �ֳƣ�����/����ģʽ,��һ������仯ʱ�����������ö���Ķ��󶼻��յ�֪ͨ���������ű仯������֮����һ��һ�Զ�Ĺ�ϵ
 */
public class ObserverTest {

	/**
	 * The main method.
	 *
	 * @param args
	 *            the arguments
	 */
	public static void main(String[] args) {
		Observer obs1 = new Observer1();
		Observer obs2 = new Observer2();
		Subject sub = new MySubject();
		sub.add(obs1);
		sub.add(obs2);
		sub.notifyObserver();
	}
}
