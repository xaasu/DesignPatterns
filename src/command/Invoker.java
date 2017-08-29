package command;

/**
 * The Class Invoker.
 */
public class Invoker {

	/** The command. */
	private Command command;

	/**
	 * Gets the command.
	 *
	 * @return the command
	 */
	public Command getCommand() {
		return command;
	}

	/**
	 * Sets the command.
	 *
	 * @param command
	 *            the new command
	 */
	public void setCommand(Command command) {
		this.command = command;
	}

	/**
	 * Instantiates a new invoker.
	 *
	 * @param command
	 *            the command
	 */
	public Invoker(Command command) {
		super();
		this.command = command;
	}

	/**
	 * Action.
	 */
	public void action() {
		command.exe();
	}
}
