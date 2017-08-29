package command;

/**
 * The Class MyCommand.
 */
public class MyCommand implements Command {

	/** The receiver. */
	private Receiver receiver;

	/**
	 * exe
	 * 
	 * @see command.Command#exe()
	 */
	@Override
	public void exe() {
		if (receiver == null) {
			receiver = new Receiver();
		}
		receiver.action();
	}

	/**
	 * Gets the receiver.
	 *
	 * @return the receiver
	 */
	public Receiver getReceiver() {
		return receiver;
	}

	/**
	 * Sets the receiver.
	 *
	 * @param receiver
	 *            the new receiver
	 */
	public void setReceiver(Receiver receiver) {
		this.receiver = receiver;
	}

}
