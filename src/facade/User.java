package facade;

/**
 * The Class User.<br>
 * ���ģʽ��Ϊ�˽��������֮�ҵ�������ϵ�ģ���springһ�������Խ������֮��Ĺ�ϵ���õ������ļ��У������ģʽ���ǽ����ǵĹ�ϵ����һ��Facade���У�
 * ����������֮�����϶�
 */
public class User {

	/**
	 * The main method.
	 *
	 * @param args
	 *            the arguments
	 */
	public static void main(String[] args) {
		Computer computer = new Computer();
		computer.startUp();
		computer.shutDown();
	}
}
