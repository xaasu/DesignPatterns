package factorymethod.commonfactory;

import factorymethod.MailSend;
import factorymethod.Sender;
import factorymethod.SmsSend;

/**
 * A factory for creating Send objects.
 */
public class SendFactory {

	/**
	 * Produce.
	 *
	 * @param input
	 *            the input
	 * @return the sender
	 */
	public static Sender produce(String input) {
		if ("mail".equals(input)) {
			return new MailSend();
		} else if ("sms".equals(input)) {
			return new SmsSend();
		} else {
			System.out.println("error");
			return null;
		}
	}
}
