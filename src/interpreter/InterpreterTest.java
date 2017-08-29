package interpreter;

/**
 * The Class InterpreterTest.<br>
 * <b>½âÊÍÆ÷Ä£Ê½</b>
 * 
 */
public class InterpreterTest {

	/**
	 * The main method.
	 *
	 * @param args
	 *            the arguments
	 */
	public static void main(String[] args) {
		int result = new Minus().interpret((new Context(new Plus().interpret(new Context(9, 2)), 8)));
		System.out.println(result);
	}
}
