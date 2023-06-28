package homework;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public abstract class Animal {

    protected String name;
    protected int age;
    protected int weight;

    public Animal(String name, int age, int weight){
        this.name = name;
        this.age = age;
        this.age = age;
    }
    public abstract void voice();
    public void eating(int feed){
        System.out.println(String.format("%s съел(-а) %d единиц корма",name,
                feed));
    }
    public abstract void move();
}
