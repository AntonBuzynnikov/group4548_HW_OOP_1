package homework;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Cat extends Animal{
    private final int maxFeed = 3;

    public Cat(String name, int age, int weight) {
        super(name, age, weight);
    }

    @Override
    public void voice() {
        System.out.println("Мяу");
    }


    @Override
    public void move() {
        System.out.println(String.format("%s идёт",name));
    }
}
