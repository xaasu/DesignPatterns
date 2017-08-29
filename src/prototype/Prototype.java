package prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * The Class Prototype.<br>
 * <b>ԭ��ģʽ</b>: ��һ��������Ϊԭ�ͣ�������и��ơ���¡������һ����ԭ�������Ƶ��¶���
 */
public class Prototype implements Cloneable, Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 2610590289104912381L;

	/** The string. */
	private String string;

	/** The obj. */
	private SerializableObject obj;

	/**
	 * clone<br>
	 * ǳ����:��һ�������ƺ󣬻����������͵ı����������´��������������ͣ�ָ��Ļ���ԭ������ָ��ġ�
	 * 
	 * @see java.lang.Object#clone()
	 */
	public Object clone() throws CloneNotSupportedException {
		Prototype proto = (Prototype) super.clone();
		return proto;
	}

	/**
	 * Deep clone.<br>
	 * ���:��һ�������ƺ󣬲����ǻ����������ͻ����������ͣ��������´����ġ�����˵��������ƽ�������ȫ���׵ĸ��ƣ���ǳ���Ʋ����ס�
	 * 
	 * @return the object
	 * @throws IOException
	 *             Signals that an I/O exception has occurred.
	 * @throws ClassNotFoundException
	 *             the class not found exception
	 */
	public Object deepClone() throws IOException, ClassNotFoundException {
		/* д�뵱ǰ����Ķ������� */
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(bos);
		oos.writeObject(this);
		/* �������������������¶��� */
		ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
		ObjectInputStream ois = new ObjectInputStream(bis);
		return ois.readObject();
	}

	/**
	 * Gets the string.
	 *
	 * @return the string
	 */
	public String getString() {
		return string;
	}

	/**
	 * Sets the string.
	 *
	 * @param string
	 *            the new string
	 */
	public void setString(String string) {
		this.string = string;
	}

	/**
	 * Gets the obj.
	 *
	 * @return the obj
	 */
	public SerializableObject getObj() {
		return obj;
	}

	/**
	 * Sets the obj.
	 *
	 * @param obj
	 *            the new obj
	 */
	public void setObj(SerializableObject obj) {
		this.obj = obj;
	}

	/**
	 * The Class SerializableObject.
	 */
	class SerializableObject implements Serializable {

		/** The Constant serialVersionUID. */
		private static final long serialVersionUID = -4486380847219730649L;

	}

}
