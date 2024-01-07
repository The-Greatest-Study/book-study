package jiin.chapter08_template_method.example;

import java.util.AbstractList;
import java.util.List;

public class MyStringList extends AbstractList<String> {
    private String[] myList;

    MyStringList(String[] strings) {
        myList = strings;
    }

    @Override
    public String get(int index) {
        return myList[index];
    }

    @Override
    public int size() {
        return myList.length;
    }

    public String set(int index, String item) {
        String oldString = myList[index];
        myList[index] = item;
        return oldString;
    }

    public static void main(String[] args) {
        String[] ducks = {"Mallard Duck", "Redhead Duck", "Rubber Duck", "Decoy Duck"};
        MyStringList duckList = new MyStringList(ducks);

        List<String> ducksSubList = duckList.subList(1, 3);
        for (String duck : ducksSubList) {
            System.out.println(duck);
        }
    }
}
