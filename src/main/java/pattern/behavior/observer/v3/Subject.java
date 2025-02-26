package pattern.behavior.observer.v3;

public interface Subject {
  void registerObserver(Observer observer);
  void unregisterObserver(Observer observer);
}
