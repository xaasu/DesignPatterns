package visitor;

/**
 * The Class MyVisitor.
 */
public class MyVisitor implements Visitor {

	/**
	 * visit
	 * 
	 * @see visitor.Visitor#visit(visitor.Subject)
	 */
	@Override
	public void visit(Subject subject) {
		System.out.println("visit the subject " + subject.getSubject());
	}

}
