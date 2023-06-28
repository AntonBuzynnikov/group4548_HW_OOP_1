package homework;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Dog extends Animal{
    public Dog(String name, int age, int weight) {
        super(name, age, weight);
    }

    @Override
    public void voice() {
        System.out.println("Гав!");
    }

    @Override
    public void move() {
        System.out.println(String.format("%s бежит", name));
    }
}
