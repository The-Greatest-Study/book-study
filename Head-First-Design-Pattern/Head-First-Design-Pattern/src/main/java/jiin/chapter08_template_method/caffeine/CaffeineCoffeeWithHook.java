package jiin.chapter08_template_method.caffeine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

public class CaffeineCoffeeWithHook extends CaffeineBeverage {
    @Override
    void brew() {
        System.out.println("필터로 커피를 우려내는 중");
    }

    @Override
    void addCondiments() {
        System.out.println("우유와 설탕을 추가하는 중");
    }

    @Override
    protected boolean customerWantsCondiments() {
        String answer = askCustomerWantsCondiments();

        if ("yes".equals(answer.toLowerCase(Locale.ROOT))) {
            return true;
        } else {
            return false;
        }
    }

    private String askCustomerWantsCondiments() {
        String answer = null;

        System.out.println("커피에 우유와 설탕을 넣을까요? (yes/no)");

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            answer = in.readLine();
        } catch (IOException ioe) {
            System.err.println("IO 오류");
        }

        return answer == null ? "no" : answer;
    }
}
