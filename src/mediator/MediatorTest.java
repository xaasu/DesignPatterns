package mediator;

/**
 * The Class MediatorTest.<br>
 * <b>�н���ģʽ</b>:
 * �н���ģʽҲ��������������֮�����ϵģ���Ϊ�������֮����������ϵ�Ļ��������ڹ��ܵ���չ��ά������ΪֻҪ�޸�һ���������������Ķ��󶼵ý����޸ġ�
 * ���ʹ���н���ģʽ��ֻ����ĺ�Mediator��Ĺ�ϵ����������֮��Ĺ�ϵ�����Ƚ���Mediator���У����е���spring���������á�
 */
public class MediatorTest {

	/**
	 * The main method.
	 *
	 * @param args
	 *            the arguments
	 */
	public static void main(String[] args) {
		Mediator mediator = new MyMediator();
		mediator.createMediator();
		mediator.workAll();
	}
}
