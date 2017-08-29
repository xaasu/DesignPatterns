package strategy;

public class Minus implements Calculator {

	@Override
	public Integer calculate(String exp) {
		String[] arrayInt = exp.split("-");
		return Integer.parseInt(arrayInt[0]) - Integer.parseInt(arrayInt[1]);
	}

}
