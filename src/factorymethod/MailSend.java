package factorymethod;

/**
 * The Class MailSend.
 */
public class MailSend implements Sender {

	/**
	 * send
	 * 
	 * @see factorymethod.Sender#send()
	 */
	@Override
	public void send() {
		System.out.println("Mail Send!");
	}

}
