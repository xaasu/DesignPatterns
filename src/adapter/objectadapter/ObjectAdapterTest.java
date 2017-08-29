package adapter.objectadapter;

import adapter.Source;

/**
 * The Class ObjectAdapterTest.<br>
 * <b>对象的适配器模式</b>:
 * 基本思路和类的适配器模式相同，只是将Adapter类作修改，这次不继承Source类，而是持有Source类的实例，以达到解决兼容性的问题<br>
 * <b>适用场景</b>:
 * 当希望将一个对象转换成满足另一个新接口的对象时，可以创建一个Wrapper类，持有原类的一个实例，在Wrapper类的方法中，调用实例的方法就行。
 */
public class ObjectAdapterTest {

	/**
	 * The main method.
	 *
	 * @param args
	 *            the arguments
	 */
	public static void main(String[] args) {
		ObjectAdapter objectAdapter = new ObjectAdapter(new Source());
		objectAdapter.method1();
		objectAdapter.method2();
	}

}
