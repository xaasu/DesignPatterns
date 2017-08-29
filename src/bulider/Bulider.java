package bulider;

import java.util.ArrayList;
import java.util.List;

import factorymethod.MailSend;
import factorymethod.Sender;
import factorymethod.SmsSend;

/**
 * The Class Bulider.
 */
public class Bulider {

	/** The list. */
	private List<Sender> list = new ArrayList<>();

	/**
	 * Produce mail sender.
	 *
	 * @param count
	 *            the count
	 */
	public void produceMailSender(int count) {
		for (int i = 0; i < count; i++) {
			System.out.println("The " + (i + 1) + " mail sender produced!");
			list.add(new MailSend());
		}
	}

	/**
	 * Produce sms sender.
	 *
	 * @param count
	 *            the count
	 */
	public void produceSmsSender(int count) {
		for (int i = 0; i < count; i++) {
			System.out.println("The " + (i + 1) + " sms sender produced!");
			list.add(new SmsSend());
		}
	}

	/**
	 * Gets the list.
	 *
	 * @return the list
	 */
	public List<Sender> getList() {
		return list;
	}

	/**
	 * Sets the list.
	 *
	 * @param list
	 *            the new list
	 */
	public void setList(List<Sender> list) {
		this.list = list;
	}

}
