package visitor;

/**
 * The Class MySubject.
 */
public class MySubject implements Subject {

	/**
	 * accept
	 * 
	 * @see visitor.Subject#accept(visitor.Visitor)
	 */
	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

	/**
	 * getSubject
	 * 
	 * @see visitor.Subject#getSubject()
	 */
	@Override
	public String getSubject() {
		return "love";
	}

}
