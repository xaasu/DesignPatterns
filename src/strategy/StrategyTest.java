package strategy;

/**
 * The Class StrategyTest.<br>
 * <b>����ģʽ</b>
 * ������ģʽ������һϵ���㷨������ÿ���㷨��װ������ʹ���ǿ����໥�滻�����㷨�ı仯����Ӱ�쵽ʹ���㷨�Ŀͻ�����Ҫ���һ���ӿڣ�Ϊһϵ��ʵ�����ṩͳһ�ķ���
 * �����ʵ����ʵ�ָýӿڣ����һ�������ࣨ���п��ޣ����ڸ����ࣩ���ṩ��������.<br>
 * �о��ͳ��󹤳�ģʽһ���� ... ����ģʽ���ڴ����࣬����ģʽ�����Ժ���չ������Ϊ�������㲻һ����
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
