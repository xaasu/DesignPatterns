package singleton;

/**
 * The Class SingletonTest.<br>
 * ����ģʽ���ܱ�֤��һ��JVM�У���������ֻ��һ��ʵ������
 */
public class SingletonTest {

	/**
	 * The main method.
	 *
	 * @param args
	 *            the arguments
	 */
	public static void main(String[] args) {
		// Singleton singleton=new Singleton(),���� ��Ϊ���캯���Ѿ�˽�л�
		Singleton.getInstance();
	}
}
