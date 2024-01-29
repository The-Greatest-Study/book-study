package swooku.chapter12_CompositePattern;

public interface QuackObservable {
    public void registerObserver(Observer observer);

    public void notifyObservers();
}
