package observer;

/**
 * The Class Observer1.
 */
public class Observer1 implements Observer {

	/**
	 * update
	 * 
	 * @see observer.Observer#update()
	 */
	@Override
	public void update() {
		System.out.println("Observer 1 has received ! ");
	}

}
