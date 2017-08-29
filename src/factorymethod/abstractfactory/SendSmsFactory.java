package factorymethod.abstractfactory;

import factorymethod.Sender;
import factorymethod.SmsSend;

/**
 * A factory for creating SendSms objects.
 */
public class SendSmsFactory implements Provider {

	/**
	 * produce
	 * 
	 * @see factorymethod.abstractfactory.Provider#produce()
	 */
	@Override
	public Sender produce() {
		return new SmsSend();
	}

}
