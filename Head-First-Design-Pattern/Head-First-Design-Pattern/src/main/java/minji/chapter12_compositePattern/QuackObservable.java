package minji.chapter12_compositePattern;

public interface QuackObservable {
    public void registerObserver(Observer observer);
    public void notifyObservers();
}
