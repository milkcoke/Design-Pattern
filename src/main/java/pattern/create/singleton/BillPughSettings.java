package pattern.create.singleton;

/**
 * Thread safe & Support lazy loading
 */
class BillPughSettings {
  private BillPughSettings() {}

  // This class will not be loaded until getInstance() method is called.
  private static class BillPughSettingsHolder {
    // Create instance when called `.getInstance()`// Lazy Loading
    private static final BillPughSettings INSTANCE = new BillPughSettings();
  }

  // This is thread safe because it accesses a static class and the static variable instance.
  public static BillPughSettings getInstance() {
    return BillPughSettingsHolder.INSTANCE;
  }
}
