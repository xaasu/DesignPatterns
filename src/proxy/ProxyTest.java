package proxy;

/**
 * The Class ProxyTest.
 * ����ģʽ���Ƕ�һ���������������ԭ�������һЩ�����������������ⷿ�ӵ�ʱ���ȥ���н飬Ϊʲô�أ���Ϊ��Ըõ������ݵ���Ϣ���յĲ���ȫ�棬
 * ϣ����һ������Ϥ����ȥ���������˴��Ĵ�����������˼�����������е�ʱ����˾��������Ҫ����ʦ����Ϊ��ʦ�ڷ��ɷ�����ר�������������ǽ��в�����
 * ������ǵ��뷨��
 */
public class ProxyTest {

	/**
	 * The main method.
	 *
	 * @param args
	 *            the arguments
	 */
	public static void main(String[] args) {
		Sourceable source = new Proxy();
		source.method();
	}
}
