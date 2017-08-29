package factorymethod.commonfactory;

/**
 * The Class FactroyTest. <br>
 * <b>��ͨ����ģʽ</b>�����ǽ���һ�������࣬��ʵ����ͬһ�ӿڵ�һЩ�����ʵ���Ĵ���. <br>
 * ���裺 <br>
 * 1���������߹�ͬ�Ľӿ� (Sender.class)<br>
 * 2������ʵ����(MailSend.class,SmsSend.calss)<br>
 * 3������������(SendFactory.class)
 */
public class FactroyTest {

	/**
	 * The main method.
	 *
	 * @param args
	 *            the arguments
	 */
	public static void main(String[] args) {
		SendFactory.produce("mail").send();
		SendFactory.produce("sms").send();
	}
}
