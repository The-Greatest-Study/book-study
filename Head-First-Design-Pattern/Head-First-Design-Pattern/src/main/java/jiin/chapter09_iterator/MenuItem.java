package jiin.chapter09_iterator;

import lombok.Getter;

@Getter
public class MenuItem {
    String name;
    String description;
    boolean vegetarian;
    double price;

    public MenuItem(String name, String description, boolean vegetarian, double price) {
        this.name = name;
        this.description = description;
        this.vegetarian = vegetarian;
        this.price = price;
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(name);
        stringBuffer.append(", ");
        stringBuffer.append(price);
        stringBuffer.append(" -- ");
        stringBuffer.append(description);

        return stringBuffer.toString();
    }
}
