package factorymethod.multifactory;

/**
 * The Class MultiFactoryTest.<br>
 * <b>多个工厂方法模式</b>,
 * 是对普通工厂方法模式的改进，在普通工厂方法模式中，如果传递的字符串出错，则不能正确创建对象，而多个工厂方法模式是提供多个工厂方法， 分别创建对象。
 */
public class MultiFactoryTest {

	/**
	 * The main method.
	 *
	 * @param args
	 *            the arguments
	 */
	public static void main(String[] args) {
		SendFactoryPlus.produceMailSend().send();
		SendFactoryPlus.produceSmsMailSend().send();
	}
}
