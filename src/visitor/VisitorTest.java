package visitor;

/**
 * The Class VisitorTest.<br>
 * <b>访问者模式</b>: 访问者模式就是一种分离对象数据结构与行为的方法，通过这种分离， 可达到为一个被访问者动态添加新的操作而无需做其它的修改的效果。
 * 该模式适用场景：如果我们想为一个现有的类增加新功能，不得不考虑几个事情： <br>
 * 1、新功能会不会与现有功能出现兼容性问题？ <br>
 * 2、以后会不会再需要添加？ <br>
 * 3、如果类不允许修改代码怎么办？<br>
 * 面对这些问题，最好的解决方法就是使用访问者模式，访问者模式适用于数据结构相对稳定的系统，把数据结构和算法解耦
 */
public class VisitorTest {

	/**
	 * The main method.
	 *
	 * @param args
	 *            the arguments
	 */
	public static void main(String[] args) {
		Visitor visitor = new MyVisitor();
		Subject subject = new MySubject();
		subject.accept(visitor);
	}
}
