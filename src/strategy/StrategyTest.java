package strategy;

/**
 * The Class StrategyTest.<br>
 * <b>策略模式</b>
 * ：策略模式定义了一系列算法，并将每个算法封装起来，使他们可以相互替换，且算法的变化不会影响到使用算法的客户。需要设计一个接口，为一系列实现类提供统一的方法
 * ，多个实现类实现该接口，设计一个抽象类（可有可无，属于辅助类），提供辅助函数.<br>
 * 感觉和抽象工厂模式一样的 ... 工厂模式用于创建类，策略模式用于以后扩展更多行为，出发点不一样。
 */
public class StrategyTest {

	/**
	 * The main method.
	 *
	 * @param args
	 *            the arguments
	 */
	public static void main(String[] args) {
		Calculator jsq = new Minus();
		System.out.println(jsq.calculate("2-5"));
		Calculator jf = new Plus();
		System.out.println(jf.calculate("2+5"));
	}
}
