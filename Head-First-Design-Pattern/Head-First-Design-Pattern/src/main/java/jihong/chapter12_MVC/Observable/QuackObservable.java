package jihong.chapter12_MVC.Observable;

public interface QuackObservable {
    public void registerObserver(Observer observer);

    public void notifyObservers();
}
