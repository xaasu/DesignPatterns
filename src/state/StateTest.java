package state;

/**
 * The Class StateTest.<br>
 * <b>״̬ģʽ</b>: �������״̬�ı�ʱ��ͬʱ�ı�����Ϊ
 */
public class StateTest {

	/**
	 * The main method.
	 *
	 * @param args
	 *            the arguments
	 */
	public static void main(String[] args) {

		State state = new State();
		Context context = new Context(state);

		// ���õ�һ��״̬
		state.setValue("state1");
		context.method();

		// ���õڶ���״̬
		state.setValue("state2");
		context.method();
	}
}
