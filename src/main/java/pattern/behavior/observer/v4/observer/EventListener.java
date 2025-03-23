package pattern.behavior.observer.v4.observer;

public interface EventListener<T> {
  void update(T event);
}
