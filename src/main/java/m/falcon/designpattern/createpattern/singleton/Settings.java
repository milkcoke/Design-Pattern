package m.falcon.designpattern.createpattern.singleton;

/**
 * Naive singleton
 * This is not thread-safe
 */
class Settings {
  // static class 는 직접 사용 전까지 지연 로딩
  private static Settings instance;

  private Settings() {}

  public static Settings getInstance() {
    if (instance == null) {
      instance = new Settings();
    }
    return instance;
  }
}
