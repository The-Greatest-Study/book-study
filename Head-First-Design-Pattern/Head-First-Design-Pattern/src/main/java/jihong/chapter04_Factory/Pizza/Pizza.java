package jihong.chapter04_Factory.Pizza;

import jihong.chapter04_Factory.Pizza.Ingredient.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public abstract class Pizza {
    public String name;

    public Dough dough;
    public Sauce sauce;

    public Veggies veggies[];
    public Cheese cheese;
    public Pepperoni pepperoni;
    public Clams clam;

    public List<String> toppings = new ArrayList<>();
    public abstract void prepare();

    public void bake() {
        System.out.println("175도에서 25분 간 굽기");
    }
    public void cut(){
        System.out.println("피자를 사선으로 자르기");
    }
    public void box() {
        System.out.println("상자에 피자 담기");
    }
    public String getName(){
        return name;
    }

}
