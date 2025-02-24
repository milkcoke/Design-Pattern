package pattern.behavior.observer.v2;

public interface Observer<T> {
  void onUpdate(T subject);
}
