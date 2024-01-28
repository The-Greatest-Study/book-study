package minho.chapter12_composite_pattern.duck_simulation;

public interface Quackable extends QuackObservable {

    /*
     * Use the words "public" or "public final" on interface fields are redundant
     */
    void quack();

}
