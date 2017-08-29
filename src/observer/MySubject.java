package observer;

import java.util.ArrayList;
import java.util.List;

/**
 * The Class MySubject.
 */
public class MySubject implements Subject {

	/** The observers. */
	private List<Observer> observers = new ArrayList<>();

	/**
	 * add.
	 *
	 * @param observer
	 *            the observer
	 * @see observer.Subject#add(observer.Observer)
	 */
	@Override
	public void add(Observer observer) {
		observers.add(observer);
	}

	/**
	 * del.
	 *
	 * @param observer
	 *            the observer
	 * @see observer.Subject#del(observer.Observer)
	 */
	@Override
	public void del(Observer observer) {
		observers.remove(observer);
	}

	/**
	 * notify.
	 *
	 * @see observer.Subject#notify(observer.Observer)
	 */
	@Override
	public void notifyObserver() {
		for (Observer observer : observers) {
			observer.update();
		}
	}

}
