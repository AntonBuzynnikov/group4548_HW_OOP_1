package homework;


public class HotDrinkAuto extends HotDrink implements VendingMachine{
    public HotDrinkAuto(String name, int volume, int temperature) {
        super(name, volume, temperature);
    }
    public HotDrinkAuto(){
        this("null",0,0);
    }



}
