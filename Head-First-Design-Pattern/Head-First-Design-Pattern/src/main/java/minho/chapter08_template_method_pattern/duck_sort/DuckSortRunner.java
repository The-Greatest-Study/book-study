package minho.chapter08_template_method_pattern.duck_sort;

import java.util.Arrays;
import java.util.List;

public class DuckSortRunner {
    public static void main(String[] args) {
        Duck[] ducks = {
                new Duck("Daffy", 8),
                new Duck("Dewey", 2),
                new Duck("Howard", 7),
                new Duck("Louie", 2),
                new Duck("Donald", 10),
                new Duck("Huey", 2)
        };

        System.out.println("정렬 전 : ");
        display(ducks);

        System.out.println();

        Arrays.sort(ducks);

        System.out.println("정렬 후 : ");
        display(ducks);

        String[] duckNames = Arrays.stream(ducks).map(Duck::getName).toList().toArray(new String[0]);
        MyStringList myStringList = new MyStringList(duckNames);
        List<String> duckSubList = myStringList.subList(2, 4);
        System.out.println(duckSubList);
    }

    private static void display(Duck[] ducks) {
        for (Duck duck : ducks) {
            System.out.println(duck);
        }
    }
}
