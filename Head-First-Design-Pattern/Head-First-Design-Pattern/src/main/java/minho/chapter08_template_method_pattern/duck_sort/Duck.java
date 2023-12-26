package minho.chapter08_template_method_pattern.duck_sort;

import lombok.Getter;

@Getter
public class Duck implements Comparable<Duck>{

    String name;
    int weight;

    public Duck(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return name + " 채중: " + weight;
    }

    @Override
    public int compareTo(Duck otherDuck) {

        if(this.weight < otherDuck.getWeight()) {
            return -1;
        } else if(this.weight == otherDuck.getWeight()) {
            return 0;
        } else{
            return 1;
        }
    }
}
