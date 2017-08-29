package templatemethod;

/**
 * The Class Minus.
 */
public class Minus extends AbstractCalculator {

	/**
	 * calculate1
	 * 
	 * @see templatemethod.AbstractCalculator#calculate1(java.lang.String)
	 */
	@Override
	public Integer calculate1(String exp) {
		return new strategy.Minus().calculate(exp);
	}

}
