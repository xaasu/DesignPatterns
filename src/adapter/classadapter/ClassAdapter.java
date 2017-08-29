package adapter.classadapter;

import adapter.Source;
import adapter.Targetable;

/**
 * The Class Adapter.
 */
public class ClassAdapter extends Source implements Targetable {

	/**
	 * method2
	 * 
	 * @see adapter.Targetable#method2()
	 */
	@Override
	public void method2() {
		System.out.println("Target mehtod : method2 !");
	}

}
