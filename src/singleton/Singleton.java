package singleton;

/**
 * The Class Singleton.
 */
public class Singleton {

	/**
	 * Instantiates a new singleton.
	 */
	private Singleton() {
	}

	/**
	 * The Class singletonFactoryClass.
	 */
	private static class singletonFactoryClass {

		/** The instance. */
		private static Singleton instance = new Singleton();
	}

	/**
	 * Gets the single instance of Singleton.
	 *
	 * @return single instance of Singleton
	 */
	public static Singleton getInstance() {
		return singletonFactoryClass.instance;
	}
}
