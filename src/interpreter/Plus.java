package interpreter;

/**
 * The Class Plus.
 */
public class Plus implements Expression {

	/**
	 * interpret
	 * 
	 * @see interpreter.Expression#interpret()
	 */
	@Override
	public int interpret(Context context) {
		return context.getNum1() + context.getNum2();
	}

}
