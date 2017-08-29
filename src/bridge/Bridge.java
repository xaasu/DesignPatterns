package bridge;

/**
 * The Class Bridge.
 */
public abstract class Bridge {

  /** The source. */
  private Sourceable source;

  /**
   * Method.
   */
  public void method() {
    source.method();
  }

  /**
   * Gets the source.
   * 
   * Returns the source
   *
   */
  public Sourceable getSource() {
    return source;
  }

  /**
   * Sets the source.
   *
   * @param source the new source
   */
  public void setSource(Sourceable source) {
    this.source = source;
  }

}
