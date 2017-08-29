package factorymethod.abstractfactory;

import factorymethod.Sender;

/**
 * The Class AbstractFactoryTest.<br>
 * <b>抽象工厂模式</b>，<br>
 * 在工厂模式的基础进行优化，对工厂类进行抽象化，多个抽象类共同实现一个接口，各自管理各自的产品,这样一旦需要增加新的功能，直接增加新的工厂类就可以了，
 * 不需要修改之前的代码。
 * 而工厂模式由于类的创建依赖工厂类，如果需要对程序进行拓展，需要修改工厂类代码违背了开闭原则。使用抽象工厂模式可以避免这个问题，当需要进行拓展时，
 * 只需要新增对应工厂类即可
 */
public class AbstractFactoryTest {

	/**
	 * The main method.
	 *
	 * @param args
	 *            the arguments
	 */
	public static void main(String[] args) {
		Provider provider = new SendMailFactory();
		Sender sender = provider.produce();
		sender.send();
	}
}
