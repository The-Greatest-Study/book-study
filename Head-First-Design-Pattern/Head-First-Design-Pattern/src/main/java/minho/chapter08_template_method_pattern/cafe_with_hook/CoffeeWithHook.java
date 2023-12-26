package minho.chapter08_template_method_pattern.cafe_with_hook;

import org.apache.commons.lang3.StringUtils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class CoffeeWithHook extends CaffeinBeverageWithHook{
    
    final static String NEED_CONDIMENTS = "y";

    @Override
    public void addCondiments() {
        System.out.println("설탕과 우유를 추가하는 중");
    }

    @Override
    public void brew() {
        System.out.println("필터로 커피를 우려내는 중");
    }

    @Override
    boolean customerWantsCondinents() {
        String answer = getUserInput();
        
        return answer.toLowerCase().startsWith(NEED_CONDIMENTS);
    }

    private String getUserInput() {
        System.out.print("커피에 우유와 설탕을 넣을까요? (y/n)?");

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        String answer = null;
        while(true){
            try{
                answer = in.readLine();
            } catch (IOException ioe) {
                System.err.println("IO오류");
            }

            if(isYn(answer)) {
                break;
            } else {
                System.out.print("(y/n)으로 입력해주세요");
            }
        }

        return StringUtils.isNoneBlank(answer) ? answer : "null";
    }

    private boolean isYn(String answer) {
        return Arrays.asList("y", "n", "Y", "N").contains(answer);
    }
}
