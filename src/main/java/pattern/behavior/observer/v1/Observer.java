package pattern.behavior.observer.v1;

public interface Observer<T> {
  /**
   * Should be refactored not limiting the parameters
   */
  void onUpdate(T data);
}
