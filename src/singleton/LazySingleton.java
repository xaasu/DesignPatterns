package singleton;

/**
 * The Class SingletonClass. ¿¡∫∫ Ω
 */
public class LazySingleton {

	/** The instance. */
	private static LazySingleton instance = null;

	/**
	 * Instantiates a new singleton class.
	 */
	private LazySingleton() {
	}

	/**
	 * Gets the single instance of SingletonClass.
	 *
	 * @return single instance of SingletonClass
	 */
	public static LazySingleton getInstance() {
		if (instance == null) {
			synchronized (LazySingleton.class) {
				instance = new LazySingleton();
			}
		}
		return instance;
	}

	/**
	 * Gets the instance 2
	 *
	 * @return the instance 
	 */
	synchronized public static LazySingleton getInstance2() {
		if (instance == null) {
			instance = new LazySingleton();
		}
		return instance;
	}
}
