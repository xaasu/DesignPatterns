package singleton;

/**
 * The Class EagerSingleton. ����ʽ
 */
public class EagerSingleton {

	/** The eager singleton. */
	private static final EagerSingleton instance = new EagerSingleton();

	/**
	 * Instantiates a new eager singleton.
	 */
	private EagerSingleton() {
		// ˽�й��췽��
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
