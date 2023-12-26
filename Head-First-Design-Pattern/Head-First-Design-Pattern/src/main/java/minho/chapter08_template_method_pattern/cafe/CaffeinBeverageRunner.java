package minho.chapter08_template_method_pattern.cafe;

public class CaffeinBeverageRunner {

    public static void main(String[] args) {
        System.out.println("티를 준비합니다.");
        Tea myTea = new Tea();
        myTea.prepareRecipe();

        System.out.println();

        System.out.println("커피를 준비합니다.");
        Coffee myCoffee = new Coffee();
        myCoffee.prepareRecipe();
    }

}
