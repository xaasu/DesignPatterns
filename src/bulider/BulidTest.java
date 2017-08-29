package bulider;

/**
 * The Class BulidTest.<br>
 */
public class BulidTest {

	/**
	 * The main method.
	 *
	 * @param args
	 *            the arguments
	 */
	public static void main(String[] args) {
		Bulider bulider = new Bulider();
		bulider.produceMailSender(10);
		bulider.produceSmsSender(10);
	}
}
