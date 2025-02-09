package pattern.behavior.observer;

public interface Subject {
  void registerObserver(Observer observer);
  void removeObserver(Observer observer);
  // This is push way
  void notifyObservers();
}
