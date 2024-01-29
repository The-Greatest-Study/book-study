package minji.chapter12_compositePattern.duckSimulator;

public interface QuackObservable {
    public void registerObserver(Observer observer);

    public void notifyObservers();
}
