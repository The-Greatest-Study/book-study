package minho.chapter08_template_method_pattern.duck_sort;

import java.util.AbstractList;

public class MyStringList extends AbstractList<String> {

    private String[] myList;

    public MyStringList(String[] myList) {
        this.myList = myList;
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
}
