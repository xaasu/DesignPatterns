package command;

/**
 * The Class CommandTest.<br>
 * <b>����ģʽ</b>: ����ģʽ��Ŀ�ľ��Ǵﵽ����ķ����ߺ�ִ����֮����ʵ�������ִ�зֿ���
 * �ٸ����ӣ�˾��Ա������ʿ��ȥ�ɼ����飬����������ĽǶ������ǣ�˾��Ա�������ǣ����������������ݣ�������ʿ�������ʿ��ȥִ�С�
 * ������̺��ڣ������໥����κ�һ��������ȥ���������ˣ�ֻ��Ҫ�����Լ����¶����У�˾��ԱҪ���ǽ��������ȥ��ע����ʿ������ôʵ�ֵġ�
 * Invoker�ǵ����ߣ�˾��Ա����Receiver�Ǳ������ߣ�ʿ������MyCommand�����ʵ����Command�ӿ�
 */
public class CommandTest {

	/**
	 * The main method.
	 *
	 * @param args
	 *            the arguments
	 */
	public static void main(String[] args) {
		Command command = new MyCommand();
		Invoker invoker = new Invoker(command);
		invoker.action();
	}
}
