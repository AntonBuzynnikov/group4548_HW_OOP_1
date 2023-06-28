package homework;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
public class HotDrink extends Drink{
    protected int temperature;

    public HotDrink(String name, int volume, int temperature) {
        super(name, volume);
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return String.format("Drink[name = '%s', volume = %d, temperature = " +
                        "%d]",name,volume, temperature);
    }
}
