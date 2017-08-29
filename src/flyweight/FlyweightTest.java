package flyweight;

/**
 * The Class FlyweightTest.<br>
 * 享元模式的主要目的是实现对象的共享，即共享池，当系统中对象多的时候可以减少内存的开销，通常与工厂模式一起使用。
 */
public class FlyweightTest {

	/**
	 * The main method.
	 *
	 * @param args
	 *            the arguments
	 */
	public static void main(String[] args) {
		FlyweightFactory factory = new FlyweightFactory();
		Flyweight flyweight1 = factory.getFlyWeight("flyweight1");
		Flyweight flyweight2 = factory.getFlyWeight("flyweight2");
		Flyweight flyweight3 = factory.getFlyWeight("flyweight3");
		Flyweight flyweight4 = factory.getFlyWeight("flyweight4");
		flyweight2.operation();
		flyweight3.operation();
		flyweight4.operation();
		flyweight1.operation();
		System.out.println(factory.getFlyweightSize());
		Flyweight flyweight5 = factory.getFlyWeight("flyweight1");
		flyweight5.operation();
		System.out.println(factory.getFlyweightSize());
	}
}
