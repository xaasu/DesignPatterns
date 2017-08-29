package interpreter;

/**
 * The Class Minus.
 */
public class Minus implements Expression {

	/**
	 * interpret.
	 *
	 * @param context
	 *            the context
	 * @return the int
	 * @see interpreter.Expression#interpret()
	 */
	@Override
	public int interpret(Context context) {
		return context.getNum1() - context.getNum2();
	}

}
