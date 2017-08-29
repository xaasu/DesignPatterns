package adapter.classadapter;

/**
 * The Class ClassAdapterTest.<br>
 * <b>适配器模式</b>:将某个类的接口转换成客户端期望的另一个接口表示，目的是消除由于接口不匹配所造成的类的兼容性问题<br>
 * <hr>
 * <b>类的适配器模式</b>:有一个Source类，拥有一个方法，待适配，目标接口时Targetable，通过Adapter类，
 * 将Source的功能扩展到Targetable里 <br>
 * <b>适用场景</b> :当希望将一个类转换成满足另一个新接口的类时，可以使用类的适配器模式，创建一个新类，继承原有的类，实现新的接口即可
 */
public class ClassAdapterTest {

	/**
	 * The main method.
	 *
	 * @param args
	 *            the arguments
	 */
	public static void main(String[] args) {
		ClassAdapter classAdapter = new ClassAdapter();
		classAdapter.method1();
		classAdapter.method2();
	}
}
