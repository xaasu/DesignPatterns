package factorymethod.multifactory;

/**
 * The Class MultiFactoryTest.<br>
 * <b>�����������ģʽ</b>,
 * �Ƕ���ͨ��������ģʽ�ĸĽ�������ͨ��������ģʽ�У�������ݵ��ַ�������������ȷ�������󣬶������������ģʽ���ṩ������������� �ֱ𴴽�����
 */
public class MultiFactoryTest {

	/**
	 * The main method.
	 *
	 * @param args
	 *            the arguments
	 */
	public static void main(String[] args) {
		SendFactoryPlus.produceMailSend().send();
		SendFactoryPlus.produceSmsMailSend().send();
	}
}
