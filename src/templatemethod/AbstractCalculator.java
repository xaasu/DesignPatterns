package templatemethod;

/**
 * The Class AbstractCalculator.
 */
public abstract class AbstractCalculator {

	/**
	 * Calculate.
	 *
	 * @param exp
	 *            the exp
	 * @return the integer
	 */
	public final Integer calculate(String exp) {
		return calculate1(exp);
	}

	/**
	 * Calculate.
	 *
	 * @param exp
	 *            the exp
	 * @return the integer
	 */
	abstract public Integer calculate1(String exp);

}
