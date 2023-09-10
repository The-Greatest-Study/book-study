package minji.chapter07_adapterPattern;

// Adapter class will turn an object to act like a different object
// In this case, Turkey -> Duck
public class TurkeyAdapter implements Duck{
    Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        for(int i=0; i<5; i++) {
            turkey.fly();
        }
    }
}
