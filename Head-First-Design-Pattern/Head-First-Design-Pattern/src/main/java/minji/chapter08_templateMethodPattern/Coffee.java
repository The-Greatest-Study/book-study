package minji.chapter08_templateMethodPattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Coffee extends CaffeineBeverage {

    // @Override annotation을 꼭 넣어야 할까?
    // https://stackoverflow.com/questions/1005898/should-i-add-an-override-annotation-when-implementing-abstract-methods-in-java
    @Override
    public void brew() {
        System.out.println("필터로 커피를 우려내는 중");
    }

    @Override
    public void addCondiments() {
        System.out.println("설탕과 우유를 추가하는 중");
    }

    @Override
    public boolean customerWantsCondiments() {

        String answer = getUserInput();

        if (answer.toLowerCase().startsWith("y")) {
            return true;
        } else {
            return false;
        }
    }

    private String getUserInput() {
        String answer = null;

        System.out.println("커피에 우유와 설탕을 넣을까요? (y/n)? ");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            answer = br.readLine();
        } catch (IOException e) {
            System.err.println("IO 오류");
        }

        if (answer == null) {
            return "no";
        }
        return answer;
    }
}
