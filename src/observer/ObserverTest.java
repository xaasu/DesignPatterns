package observer;

/**
 * The Class ObserverTest.<br>
 * <b>观察者模式</b>: 又称：发布/订阅模式,当一个对象变化时，其它依赖该对象的对象都会收到通知，并且随着变化！对象之间是一种一对多的关系
 */
public class ObserverTest {

	/**
	 * The main method.
	 *
	 * @param args
	 *            the arguments
	 */
	public static void main(String[] args) {
		Observer obs1 = new Observer1();
		Observer obs2 = new Observer2();
		Subject sub = new MySubject();
		sub.add(obs1);
		sub.add(obs2);
		sub.notifyObserver();
	}
}
