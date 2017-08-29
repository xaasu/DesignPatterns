package adapter.interfaceadapter;

/**
 * The Class InterfaceAdapterTest.<br>
 * <b>接口的适配器模式</b>:
 * 借助于一个抽象类(Wrapper.class)，该抽象类实现了接口(Sourceable.class)，实现了所有的方法，而我们不和原始的接口打交道，
 * 只和该抽象类取得联系，所以我们写一个类(SourceSub1.class,SourceSub2.class)， 继承该抽象类， 重写需要的方法。<br>
 * <b>适应场景</b>:当不希望实现一个接口中所有的方法时，可以创建一个抽象类Wrapper，实现所有方法，我们写别的类的时候，继承抽象类即可。
 */
public class InterfaceAdapterTest {

	/**
	 * The main method.
	 *
	 * @param args
	 *            the arguments
	 */
	public static void main(String[] args) {
		Sourceable sourceSub1 = new SourceSub1();
		Sourceable sourceSub2 = new SourceSub2();
		sourceSub1.method1();
		sourceSub2.method2();
	}
}
