package minji.chapter08_templateMethodPattern;

import java.util.AbstractList;

public class MyStringList extends AbstractList<String> {
    private String[] myList;

    public MyStringList(String[] stringList) {
        this.myList = stringList;
    }

    @Override
    public String get(int index) {
        return myList[index];
    }

    @Override
    public int size() {
        return myList.length;
    }

    public String set(int index, String newString) {
        String oldString = myList[index];
        myList[index] = newString;
        return oldString;
    }
}
