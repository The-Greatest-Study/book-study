package minho.chapter09_collection_management.menu;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class PancakeHouseMenu {

    List<MenuItem> menuItems = new ArrayList<>();

    public PancakeHouseMenu() {

        addMenu("K&B 팬케이크 세트"
                , "스크램블 에그와 토스트가 곁들여진 팬케이크"
                , true
                , 2.99);

        addMenu("레귤러 팬케이크 세트"
                , "달걀 프라이와와 소시지가 곁들여진 팬케이크"
                , false
                , 2.99);

        addMenu("블루베리 팬케이크"
                , "신선한 블루베리와 시럽으로 만든 팬케이크"
                , true
                , 3.49);

        addMenu("와플"
                , "취향에 따라 블루베리나 딸기를 얹을 수 있는 와플"
                , true
                , 3.59);

    }

    public void addMenu(String name, String description, boolean vegetarian, double price) {

        menuItems.add(MenuItem.builder()
                .name(name)
                .description(description)
                .vegetarian(vegetarian)
                .price(price)
                .build());

    }

    public Iterator createIterator(){
        return new PancakeHouseMenuIterator(menuItems);
    }

}
