package jiin.chapter08_template_method.example;

import lombok.Getter;
import lombok.ToString;

@ToString
@Getter
public class Duck implements Comparable<Duck> {
    private String name;
    private int weight;

    public Duck(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    @Override
    public int compareTo(Duck otherDuck) {
        return Integer.compare(this.weight, otherDuck.weight);
    }
}
