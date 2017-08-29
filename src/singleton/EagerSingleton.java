package singleton;

/**
 * The Class EagerSingleton. 饿汉式
 */
public class EagerSingleton {

	/** The eager singleton. */
	private static final EagerSingleton instance = new EagerSingleton();

	/**
	 * Instantiates a new eager singleton.
	 */
	private EagerSingleton() {
		// 私有构造方法
	}

	/**
	 * Gets the single instance of EagerSingleton.
	 *
	 * @return single instance of EagerSingleton
	 */
	public static EagerSingleton getInstance() {
		return instance;
	}
}
