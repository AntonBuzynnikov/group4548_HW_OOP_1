package homework;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Cat cat_1 = new Cat("Маркиз",2,4);
        Dog dog_1 = new Dog("Рекс",1,8);
        Rat rat_1 = new Rat("Сплинтер",1,1);
        List<Animal> animalList = new ArrayList<>();
        animalList.add(cat_1);
        animalList.add(dog_1);
        animalList.add(rat_1);
        for (Animal animal:animalList) {
            animal.voice();
            animal.eating(3);
            animal.move();
            System.out.println("-----------");
        }
    }


}