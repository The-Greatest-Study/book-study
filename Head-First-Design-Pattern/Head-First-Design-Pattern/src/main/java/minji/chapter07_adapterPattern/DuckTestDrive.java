package minji.chapter07_adapterPattern;

public class DuckTestDrive {
    public static void main(String[] args) {
        Duck duck = new MallardDuck();

        minji.chapter07_adapterPattern.Turkey turkey = new minji.chapter07_adapterPattern.WildTurkey();
        Duck turkeyAdapter = new minji.chapter07_adapterPattern.TurkeyAdapter(turkey);

        System.out.println("칠면조가 말하길");
        turkey.gobble();
        turkey.fly();

        System.out.println("\n오리가 말하길");
        testDuck(duck);

        System.out.println("\n 칠면조 어댑터가 말하길");
        testDuck(turkeyAdapter);
    }

    static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }
}
