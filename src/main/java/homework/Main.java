package homework;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static List<HotDrink> drinkList= new ArrayList<>();
    public static void main(String[] args) {
        HotDrink hd_1 = new HotDrink("Latte", 300, 60);
        HotDrink hd_2 = new HotDrink("Raf",350,50);
        HotDrinkAuto hd_3 = new HotDrinkAuto("Cappuccino", 250, 60);
        HotDrinkAuto hd_4 = new HotDrinkAuto("FlatWhite", 250,70);
        drinkList.add(hd_1);
        drinkList.add(hd_2);
        drinkList.add(hd_3);
        drinkList.add(hd_4);
        getProduct("Cappuccino",250,60);


    }
    public static void getProduct(String name, int volume, int temperature){
        for (HotDrink drink: drinkList) {
            if(drink.getName().equals(name) && drink.getVolume() == volume && drink.getTemperature() == temperature ){
                System.out.println(drink);
            }
        }
    }
}