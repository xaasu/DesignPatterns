package templatemethod;

/**
 * The Class TemplateMethodTest.<br>
 * <b>模板方法模式</b>:
 * 一个抽象类中，有一个主方法，再定义1...n个方法，可以是抽象的，也可以是实际的方法，定义一个类，继承该抽象类，重写抽象方法，通过调用抽象类，
 * 实现对子类的调用
 */
public class TemplateMethodTest {

	/**
	 * The main method.
	 *
	 * @param args
	 *            the arguments
	 */
	public static void main(String[] args) {
		AbstractCalculator plus = new Plus();
		System.out.println(plus.calculate("10+10"));
		AbstractCalculator minus = new Minus();
		System.out.println(minus.calculate("50-7"));
	}
}
