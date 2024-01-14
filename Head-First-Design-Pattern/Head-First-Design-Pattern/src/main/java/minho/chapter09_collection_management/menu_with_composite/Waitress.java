package minho.chapter09_collection_management.menu_with_composite;

public class Waitress {

    private MenuComponent allMenus;

    private Waitress(MenuComponent allMenus) {
        this.allMenus = allMenus;
    }

    public static Waitress from(MenuComponent allMenus) {
        return new Waitress(allMenus);
    }

    public void printMenu() {
        allMenus.print();
    }
}
