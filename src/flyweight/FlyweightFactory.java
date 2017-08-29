package flyweight;

import java.util.Hashtable;

/**
 * A factory for creating Flyweight objects.
 */
public class FlyweightFactory {

	/** The flyweights. */
	private Hashtable<Object, Flyweight> flyweights = new Hashtable<>();

	/**
	 * Instantiates a new flyweight factory.
	 */
	public FlyweightFactory() {
	}

	/**
	 * Gets the fly weight.
	 *
	 * @param obj
	 *            the obj
	 * @return the fly weight
	 */
	public Flyweight getFlyWeight(Object obj) {
		Flyweight flyweight = flyweights.get(obj);
		if (flyweight == null) {
			flyweight = new ConcreteFlyweight((String) obj);
			flyweights.put(obj, flyweight);
		}
		return flyweight;
	}

	/**
	 * Gets the flyweight size.
	 *
	 * @return the flyweight size
	 */
	public int getFlyweightSize() {
		return flyweights.size();
	}
}
