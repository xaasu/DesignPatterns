package visitor;

/**
 * The Class VisitorTest.<br>
 * <b>������ģʽ</b>: ������ģʽ����һ�ַ���������ݽṹ����Ϊ�ķ�����ͨ�����ַ��룬 �ɴﵽΪһ���������߶�̬����µĲ������������������޸ĵ�Ч����
 * ��ģʽ���ó��������������Ϊһ�����е��������¹��ܣ����ò����Ǽ������飺 <br>
 * 1���¹��ܻ᲻�������й��ܳ��ּ��������⣿ <br>
 * 2���Ժ�᲻������Ҫ��ӣ� <br>
 * 3������಻�����޸Ĵ�����ô�죿<br>
 * �����Щ���⣬��õĽ����������ʹ�÷�����ģʽ��������ģʽ���������ݽṹ����ȶ���ϵͳ�������ݽṹ���㷨����
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
