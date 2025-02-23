package pattern.behavior.observer.v1;

public interface Subject {
  void registerObserver(Observer observer);
  void removeObserver(Observer observer);
  // This is push way
  void notifyObservers();
}
