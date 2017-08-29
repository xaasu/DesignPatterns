package mediator;

/**
 * The Class User2.
 */
public class User2 extends User {

	/**
	 * Instantiates a new user 2.
	 *
	 * @param mediator the mediator
	 */
	public User2(Mediator mediator) {
		super(mediator);
	}

	/** 
	 * work
	 * @see mediator.User#work()
	 */
	@Override
	public void work() {
		System.out.println("User 2 exe !");
	}

}
