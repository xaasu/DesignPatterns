package prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * The Class Prototype.<br>
 * <b>原型模式</b>: 将一个对象作为原型，对其进行复制、克隆，产生一个和原对象类似的新对象
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
	 * 浅复制:将一个对象复制后，基本数据类型的变量都会重新创建，而引用类型，指向的还是原对象所指向的。
	 * 
	 * @see java.lang.Object#clone()
	 */
	public Object clone() throws CloneNotSupportedException {
		Prototype proto = (Prototype) super.clone();
		return proto;
	}

	/**
	 * Deep clone.<br>
	 * 深复制:将一个对象复制后，不论是基本数据类型还有引用类型，都是重新创建的。简单来说，就是深复制进行了完全彻底的复制，而浅复制不彻底。
	 * 
	 * @return the object
	 * @throws IOException
	 *             Signals that an I/O exception has occurred.
	 * @throws ClassNotFoundException
	 *             the class not found exception
	 */
	public Object deepClone() throws IOException, ClassNotFoundException {
		/* 写入当前对象的二进制流 */
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(bos);
		oos.writeObject(this);
		/* 读出二进制流产生的新对象 */
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
