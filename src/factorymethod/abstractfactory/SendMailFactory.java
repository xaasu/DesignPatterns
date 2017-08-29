package factorymethod.abstractfactory;

import factorymethod.MailSend;
import factorymethod.Sender;

/**
 * A factory for creating SendMail objects.
 */
public class SendMailFactory implements Provider {

	/**
	 * produce
	 * 
	 * @see factorymethod.abstractfactory.Provider#produce()
	 */
	@Override
	public Sender produce() {
		return new MailSend();
	}

}
