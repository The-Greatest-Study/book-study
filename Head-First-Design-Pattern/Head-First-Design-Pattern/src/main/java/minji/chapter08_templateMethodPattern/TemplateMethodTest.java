package minji.chapter08_templateMethodPattern;

public class TemplateMethodTest {
    public static void main(String[] args) {
        System.out.println("====== 차 만드는중 ======");
        Tea myTea = new Tea();
        myTea.prepareRecipe();

        System.out.println("====== 커피 만드는중 ======");
        Coffee myCoffee = new Coffee();
        myCoffee.prepareRecipe();
    }
}
