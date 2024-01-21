package minji.chapter11_proxyPattern;

import java.lang.reflect.Proxy;

public class MatchMakingTestDrive {
    public static void main(String[] args) {
        MatchMakingTestDrive test = new MatchMakingTestDrive();
        test.drive();
    }

    public MatchMakingTestDrive() {
        // initializeDatabase();
    }

    public void drive() {
        Person minji = new PersonImpl("Minji", "Female", "");
        Person ownerProxy = getOwnerProxy(minji);
        System.out.println("이름: " + ownerProxy.getName());
        ownerProxy.setInterests("테니스");
        System.out.println("본인 프록시에 관심 사항을 등록합니다.");

        try {
            ownerProxy.setGeekRating(10);
        } catch (Exception e) {
            System.out.println("본인 프록시에는 괴짜 지수를 매길 수 없습니다.");
        }

        Person joe = new PersonImpl("Joe", "Male", "바둑");
        Person nonOwnerProxy = getNonOwnerProxy(joe);
        System.out.println("이름: " + nonOwnerProxy.getName());

        try {
            nonOwnerProxy.setInterests("바둑");
        } catch (Exception e) {
            System.out.println("타인 프록시에는 관심사를 등록할 수 없습니다.");
        }
        nonOwnerProxy.setGeekRating(3);
        System.out.println("타인 프록시에 괴짜 점수를 매깁니다.");
        System.out.println("괴짜 지수: " + nonOwnerProxy.getGeekRating());
    }

    Person getOwnerProxy(Person person) {
        return (Person)
                Proxy.newProxyInstance(
                        person.getClass().getClassLoader(),
                        person.getClass().getInterfaces(),
                        new OwnerInvocationHandler(person));
    }

    Person getNonOwnerProxy(Person person) {
        return (Person)
                Proxy.newProxyInstance(
                        person.getClass().getClassLoader(),
                        person.getClass().getInterfaces(),
                        new NonOwnerInvocationHandler(person));
    }
}
