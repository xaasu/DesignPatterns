package factorymethod.abstractfactory;

import factorymethod.Sender;

/**
 * The Class AbstractFactoryTest.<br>
 * <b>���󹤳�ģʽ</b>��<br>
 * �ڹ���ģʽ�Ļ��������Ż����Թ�������г��󻯣���������๲ͬʵ��һ���ӿڣ����Թ�����ԵĲ�Ʒ,����һ����Ҫ�����µĹ��ܣ�ֱ�������µĹ�����Ϳ����ˣ�
 * ����Ҫ�޸�֮ǰ�Ĵ��롣
 * ������ģʽ������Ĵ������������࣬�����Ҫ�Գ��������չ����Ҫ�޸Ĺ��������Υ���˿���ԭ��ʹ�ó��󹤳�ģʽ���Ա���������⣬����Ҫ������չʱ��
 * ֻ��Ҫ������Ӧ�����༴��
 */
public class AbstractFactoryTest {

	/**
	 * The main method.
	 *
	 * @param args
	 *            the arguments
	 */
	public static void main(String[] args) {
		Provider provider = new SendMailFactory();
		Sender sender = provider.produce();
		sender.send();
	}
}
