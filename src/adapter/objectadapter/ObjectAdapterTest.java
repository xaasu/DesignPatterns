package adapter.objectadapter;

import adapter.Source;

/**
 * The Class ObjectAdapterTest.<br>
 * <b>�����������ģʽ</b>:
 * ����˼·�����������ģʽ��ͬ��ֻ�ǽ�Adapter�����޸ģ���β��̳�Source�࣬���ǳ���Source���ʵ�����Դﵽ��������Ե�����<br>
 * <b>���ó���</b>:
 * ��ϣ����һ������ת����������һ���½ӿڵĶ���ʱ�����Դ���һ��Wrapper�࣬����ԭ���һ��ʵ������Wrapper��ķ����У�����ʵ���ķ������С�
 */
public class ObjectAdapterTest {

	/**
	 * The main method.
	 *
	 * @param args
	 *            the arguments
	 */
	public static void main(String[] args) {
		ObjectAdapter objectAdapter = new ObjectAdapter(new Source());
		objectAdapter.method1();
		objectAdapter.method2();
	}

}
