package jiin.chapter09_composite;

import lombok.experimental.UtilityClass;

@UtilityClass
public class MenuUtility {
    public static class PancakeHouseMenu {
        public static final MenuItem KNB_PANCAKE_SET =
                new MenuItem("K&B 팬케이크 세트", "스크램블 에그와 토스트가 곁들여진 팬케이크", true, 2.99);
        public static final MenuItem REGULAR_PANCAKE_SET =
                new MenuItem("레귤러 팬케이크 세트", "달걀 프라이와 소시지가 곁들여진 팬케이크", false, 2.99);
        public static final MenuItem BLUEBERRY_PANCAKE =
                new MenuItem("블루베리 팬케이크", "신선한 블루베리와 블루베리 시럽으로 만든 팬케이크", true, 3.49);
        public static final MenuItem WAFFLE =
                new MenuItem("와플", "취향에 따라 블루베리나 딸기를 얹을 수 있는 와플", true, 3.59);

        public static void addAllPancakeHouseMenu(MenuComponent menu) {
            menu.add(KNB_PANCAKE_SET);
            menu.add(REGULAR_PANCAKE_SET);
            menu.add(BLUEBERRY_PANCAKE);
            menu.add(WAFFLE);
        }
    }

    public static class DinerMenu {
        public static final MenuItem VEGETARIAN_BLT =
                new MenuItem("채식주의자용 BLT", "통밀 위에 콩고기 베이컨, 상추, 토마토를 얹은 메뉴", true, 2.99);
        public static final MenuItem BLT =
                new MenuItem("BLT", "통밀 위에 베이컨, 상추, 토마토를 얹은 메뉴", false, 2.99);
        public static final MenuItem SOUP_OF_TODAY =
                new MenuItem("오늘의 스프", "감자 샐러드를 곁들인 오늘의 스프", false, 3.29);
        public static final MenuItem HOT_DOG =
                new MenuItem("핫도그", "사워크라우트, 갖은 양념, 양파, 치즈가 곁들여진 핫도그", false, 3.05);
        public static final MenuItem STEAMED_VEGETABLES_AND_BROWN_RICE =
                new MenuItem("찐 채소와 브라운 라이스", "찐 채소와 브라운 라이스의 절묘한 조화", true, 3.99);
        public static final MenuItem PASTA =
                new MenuItem("파스타", "마리나라 소스 스파게티, 효모빵도 드립니다.", true, 3.89);

        public static void addAllDinerMenu(MenuComponent menu) {
            menu.add(VEGETARIAN_BLT);
            menu.add(BLT);
            menu.add(SOUP_OF_TODAY);
            menu.add(HOT_DOG);
            menu.add(STEAMED_VEGETABLES_AND_BROWN_RICE);
            menu.add(PASTA);
        }
    }

    public static class CafeMenu {
        public static final MenuItem VEGGIE_BURGER_AND_FRIES =
                new MenuItem("베지 버거와 에어 프라이", "통밀빵, 상추, 토마토, 감자 튀김이 첨가된 베지 버거", true, 3.99);
        public static final MenuItem SOUP_OF_TODAY =
                new MenuItem("오늘의 스프", "샐러드가 곁들여진 오늘의 스프", false, 3.69);
        public static final MenuItem BURRITO =
                new MenuItem("부리토", "통 핀토콩과 살사, 구아카몰이 곁들여진 푸짐한 부리토", true, 4.29);

        public static void addAllCafeMenu(MenuComponent menu) {
            menu.add(VEGGIE_BURGER_AND_FRIES);
            menu.add(SOUP_OF_TODAY);
            menu.add(BURRITO);
        }
    }

    public static class DessertMenu {
        public static final MenuItem APPLE_PIE =
                new MenuItem("애플 파이", "바삭바삭한 크러스트에 바닐라 아이스크림이 얹혀있는 애플 파이", true, 1.59);
        public static final MenuItem CHEESE_CAKE =
                new MenuItem("치즈케이크", "초콜릿 그레이엄 크러스트 위에 부드러운 뉴욕 치즈케이크", true, 1.99);
        public static final MenuItem SORBET = new MenuItem("소르베", "라스베리와 라임의 절묘한 조화", true, 1.89);

        public static void addAllDesertMenu(MenuComponent menu) {
            menu.add(APPLE_PIE);
            menu.add(CHEESE_CAKE);
            menu.add(SORBET);
        }
    }
}
