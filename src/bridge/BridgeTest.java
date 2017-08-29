package bridge;

/**
 * The Class BridgeTest.<br>
 * <b>�Ž�ģʽ<b>:�Ž�ģʽ���ǰ�����������ʵ�ַֿ���ʹ���ǿ��Ը��Զ����ı仯���Žӵ������ǣ���������ʵ�ֻ����ʹ�ö��߿��Զ����仯��
 * �����ǳ��õ�JDBC��DriverManagerһ����JDBC�����������ݿ��ʱ���ڸ������ݿ�֮������л�����������Ҫ��̫��Ĵ��룬����˿�����ö���
 * ԭ�����JDBC�ṩͳһ�ӿڣ�ÿ�����ݿ��ṩ���Ե�ʵ�֣���һ���������ݿ������ĳ������ŽӾ����ˡ�
 */
public class BridgeTest {

	/**
	 * The main method.
	 *
	 * @param args
	 *            the arguments
	 */
	public static void main(String[] args) {
		Bridge bridge = new MyBridge();
		bridge.setSource(new SourceSub1());
		bridge.method();

		bridge.setSource(new SourceSub2());
		bridge.method();
	}
}
