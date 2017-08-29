package factorymethod;

/**
 * The Class SmsSend.
 */
public class SmsSend implements Sender {

	/**
	 * send
	 * 
	 * @see factorymethod.Sender#send()
	 */
	@Override
	public void send() {
		System.out.println("SMS Send!");
	}

}
