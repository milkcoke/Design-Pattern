package m.falcon.designpattern.createpattern.singleton;

/**
 * Thread-Safe but eager loading
 * Use this approach when instance creation is cheap.
 */
class ThreadSafeSettings {

  // Eager Loading
  private static final ThreadSafeSettings INSTANCE = new ThreadSafeSettings();
  private ThreadSafeSettings(){}

  public static ThreadSafeSettings getInstance() {
    return INSTANCE;
  }
}
