package jihong.chapter12_MVC;

import jihong.chapter12_MVC.Duck.Quackable;
import lombok.AllArgsConstructor;
import lombok.Getter;

//데코레이터
@AllArgsConstructor
@Getter
public class QuackCounter implements Quackable {
    private Quackable duck;
    private static int numberOfQuacks;

    @Override
    public void quack() {

        duck.quack();
        numberOfQuacks++;
    }
}
