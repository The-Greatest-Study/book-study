package minji.chapter08_templateMethodPattern;

import java.util.List;

public class MyStringListTest {
    public static void main(String[] args) {
        String[] ducks = {"Mallard Duck", "Redhead Duck", "Rubber Duck", "Decoy Duck"};
        MyStringList ducksList = new MyStringList(ducks);
        List ducksSubList = ducksList.subList(2, 4);

        System.out.println(ducksSubList);
    }
}
