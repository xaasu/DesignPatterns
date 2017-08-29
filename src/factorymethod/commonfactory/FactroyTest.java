package factorymethod.commonfactory;

/**
 * The Class FactroyTest. <br>
 * <b>普通工厂模式</b>，就是建立一个工厂类，对实现了同一接口的一些类进行实例的创建. <br>
 * 步骤： <br>
 * 1，创建二者共同的接口 (Sender.class)<br>
 * 2，创建实现类(MailSend.class,SmsSend.calss)<br>
 * 3，创建工厂类(SendFactory.class)
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
