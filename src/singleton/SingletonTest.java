package singleton;

/**
 * The Class SingletonTest.<br>
 * 单例模式：能保证在一个JVM中，单例对象只有一个实例存在
 */
public class SingletonTest {

	/**
	 * The main method.
	 *
	 * @param args
	 *            the arguments
	 */
	public static void main(String[] args) {
		// Singleton singleton=new Singleton(),报错。 因为构造函数已经私有化
		Singleton.getInstance();
	}
}
