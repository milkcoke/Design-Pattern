package pattern.behavior.observer.v2;

public interface Subject {
  void registerObserver(Observer observer);
  void unregisterObserver(Observer observer);
}
