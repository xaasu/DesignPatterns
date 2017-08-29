package mediator;

/**
 * The Class User1.
 */
public class User1 extends User {

	/**
	 * Instantiates a new user 1.
	 *
	 * @param mediator
	 *            the mediator
	 */
	public User1(Mediator mediator) {
		super(mediator);
	}

	/**
	 * work
	 * 
	 * @see mediator.User#work()
	 */
	@Override
	public void work() {
		System.out.println("User 1 exe !");
	}

}
