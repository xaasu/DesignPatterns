package adapter.classadapter;

/**
 * The Class ClassAdapterTest.<br>
 * <b>������ģʽ</b>:��ĳ����Ľӿ�ת���ɿͻ�����������һ���ӿڱ�ʾ��Ŀ�����������ڽӿڲ�ƥ������ɵ���ļ���������<br>
 * <hr>
 * <b>���������ģʽ</b>:��һ��Source�࣬ӵ��һ�������������䣬Ŀ��ӿ�ʱTargetable��ͨ��Adapter�࣬
 * ��Source�Ĺ�����չ��Targetable�� <br>
 * <b>���ó���</b> :��ϣ����һ����ת����������һ���½ӿڵ���ʱ������ʹ�����������ģʽ������һ�����࣬�̳�ԭ�е��࣬ʵ���µĽӿڼ���
 */
public class ClassAdapterTest {

	/**
	 * The main method.
	 *
	 * @param args
	 *            the arguments
	 */
	public static void main(String[] args) {
		ClassAdapter classAdapter = new ClassAdapter();
		classAdapter.method1();
		classAdapter.method2();
	}
}
