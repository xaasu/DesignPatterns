package templatemethod;

/**
 * The Class Plus.
 */
public class Plus extends AbstractCalculator {

	/**
	 * calculate1
	 * 
	 * @see templatemethod.AbstractCalculator#calculate1(java.lang.String)
	 */
	@Override
	public Integer calculate1(String exp) {

		return new strategy.Plus().calculate(exp);
	}

}
