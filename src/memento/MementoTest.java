package memento;

/**
 * The Class MementoTest.<br>
 * <b>����¼ģʽ</>: ��ҪĿ���Ǳ���һ�������ĳ��״̬���Ա����ʵ���ʱ��ָ�����.
 * ������ԭʼ��A��A���и������ԣ�A���Ծ�����Ҫ���ݵ����ԣ�����¼��B�������洢A��һЩ�ڲ�״̬����C�أ�����һ�������洢����¼�ģ���ֻ�ܴ洢�������޸ĵȲ�����
 * Original����ԭʼ�࣬��������Ҫ���������value������һ������¼�࣬��������valueֵ��
 * Memento���Ǳ���¼�࣬
 * Storage���Ǵ洢����¼���࣬����Memento���ʵ��
 */
public class MementoTest {

	/**
	 * The main method.
	 *
	 * @param args
	 *            the arguments
	 */
	public static void main(String[] args) {
		Original original = new Original("10086");
		Storage storage = new Storage(original.createMemento());
		original.setValue("10010");
		original.restoreMemento(storage.getMemento());
	}
}
