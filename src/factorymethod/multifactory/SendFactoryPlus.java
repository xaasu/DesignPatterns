package factorymethod.multifactory;

import factorymethod.MailSend;
import factorymethod.Sender;
import factorymethod.SmsSend;

/**
 * The Class SendFactoryPlus.
 */
public class SendFactoryPlus {

	/**
	 * Produce mail send.
	 *
	 * @return the sender
	 */
	public static Sender produceMailSend() {
		return new MailSend();
	}

	/**
	 * Produce sms mail send.
	 *
	 * @return the sender
	 */
	public static Sender produceSmsMailSend() {
		return new SmsSend();
	}
}
