package mediator;

/**
 * The Class MyMediator.
 */
public class MyMediator implements Mediator {

	/** The user 1. */
	private User user1;

	/** The user 2. */
	private User user2;

	/**
	 * createMediator
	 * 
	 * @see mediator.Mediator#createMediator()
	 */
	@Override
	public void createMediator() {
		user1 = new User1(this);
		user2 = new User2(this);
	}

	/**
	 * workAll
	 * 
	 * @see mediator.Mediator#workAll()
	 */
	@Override
	public void workAll() {
		user1.work();
		user2.work();
	}

}
