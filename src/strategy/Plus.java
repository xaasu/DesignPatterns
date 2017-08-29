package strategy;

/**
 * The Class Plus.
 */
public class Plus implements Calculator {

	/**
	 * calculate
	 * 
	 * @see strategy.Calculator#calculate(java.lang.String)
	 */
	@Override
	public Integer calculate(String exp) {
		String[] arrayInt = exp.split("\\+");
		return Integer.parseInt(arrayInt[0]) + Integer.parseInt(arrayInt[1]);
	}

}
