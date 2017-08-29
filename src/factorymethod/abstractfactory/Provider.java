package factorymethod.abstractfactory;

import factorymethod.Sender;

/**
 * The Interface Provider.
 */
public interface Provider {

	/**
	 * Produce.
	 *
	 * @return the sender
	 */
	Sender produce();
}
