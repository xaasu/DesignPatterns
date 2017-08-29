package templatemethod;

/**
 * The Class TemplateMethodTest.<br>
 * <b>ģ�巽��ģʽ</b>:
 * һ���������У���һ�����������ٶ���1...n�������������ǳ���ģ�Ҳ������ʵ�ʵķ���������һ���࣬�̳иó����࣬��д���󷽷���ͨ�����ó����࣬
 * ʵ�ֶ�����ĵ���
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
