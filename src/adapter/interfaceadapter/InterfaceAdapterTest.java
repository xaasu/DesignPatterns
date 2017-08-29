package adapter.interfaceadapter;

/**
 * The Class InterfaceAdapterTest.<br>
 * <b>�ӿڵ�������ģʽ</b>:
 * ������һ��������(Wrapper.class)���ó�����ʵ���˽ӿ�(Sourceable.class)��ʵ�������еķ����������ǲ���ԭʼ�Ľӿڴ򽻵���
 * ֻ�͸ó�����ȡ����ϵ����������дһ����(SourceSub1.class,SourceSub2.class)�� �̳иó����࣬ ��д��Ҫ�ķ�����<br>
 * <b>��Ӧ����</b>:����ϣ��ʵ��һ���ӿ������еķ���ʱ�����Դ���һ��������Wrapper��ʵ�����з���������д������ʱ�򣬼̳г����༴�ɡ�
 */
public class InterfaceAdapterTest {

	/**
	 * The main method.
	 *
	 * @param args
	 *            the arguments
	 */
	public static void main(String[] args) {
		Sourceable sourceSub1 = new SourceSub1();
		Sourceable sourceSub2 = new SourceSub2();
		sourceSub1.method1();
		sourceSub2.method2();
	}
}
