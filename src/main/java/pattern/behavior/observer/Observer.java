package pattern.behavior.observer;

public interface Observer<T> {
  /**
   * Should be refactored not limiting the parameters
   */
  void onUpdate(T data);
}
