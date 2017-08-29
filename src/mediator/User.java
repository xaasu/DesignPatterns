package mediator;

/**
 * The Class User.
 */
public abstract class User {

	/** The mediator. */
	private Mediator mediator;

	/**
	 * Gets the mediator.
	 *
	 * @return the mediator
	 */
	public Mediator getMediator() {
		return mediator;
	}

	public User(Mediator mediator) {
		super();
		this.mediator = mediator;
	}

	/**
	 * Work.
	 */
	public abstract void work();
}
