package homework;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Rat extends Animal{
    public Rat(String name, int age, int weight) {
        super(name, age, weight);
    }

    @Override
    public void voice() {
        System.out.println("Пик-пик");
    }

    @Override
    public void move() {
        System.out.println(String.format("%s ползёт",name));
    }
}
