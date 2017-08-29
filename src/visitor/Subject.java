package visitor;

/**
 * The Interface Subject.
 */
public interface Subject {

	/**
	 * Accept.
	 *
	 * @param visitor
	 *            the visitor
	 */
	void accept(Visitor visitor);

	/**
	 * Gets the subject.
	 *
	 * @return the subject
	 */
	String getSubject();
}
