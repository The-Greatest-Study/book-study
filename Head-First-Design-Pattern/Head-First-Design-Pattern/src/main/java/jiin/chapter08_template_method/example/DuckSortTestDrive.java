package jiin.chapter08_template_method.example;

import java.util.Arrays;

public class DuckSortTestDrive {
    public static void main(String[] args) {
        Duck[] ducks = {
                new Duck("Daffy", 9),
                new Duck("Dewey", 2),
                new Duck("Howard", 7),
                new Duck("Louie", 2),
                new Duck("Donald", 10),
                new Duck("Huey", 2)
        };

        System.out.println("before sorting");
        display(ducks);

        Arrays.sort(ducks);

        System.out.println("\nafter sorting");
        display(ducks);
    }

    public static void display(Object[] objects){
        for(Object object : objects){
            System.out.println(object);
        }
    }
}
