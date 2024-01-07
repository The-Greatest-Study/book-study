package jiin.chapter09_composite;

import lombok.Getter;

@Getter
public class MenuItem extends MenuComponent {
    private String name;
    private String description;
    private boolean vegetarian;
    private double price;

    public MenuItem(String name, String description, boolean vegetarian, double price) {
        this.name = name;
        this.description = description;
        this.vegetarian = vegetarian;
        this.price = price;
    }

    @Override
    public void print() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("  ");
        stringBuffer.append(name);
        if (vegetarian) {
            stringBuffer.append("(v)");
        }

        stringBuffer.append(", ");
        stringBuffer.append(price);
        stringBuffer.append("\t -- ");
        stringBuffer.append(description);

        System.out.println(stringBuffer);
    }
}
