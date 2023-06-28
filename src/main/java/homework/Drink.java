package homework;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
public class Drink {
    protected String name;
    protected int volume;

    @Override
    public String toString() {
        return String.format("Drink[name = '%s', volume = %d]",name,volume);
    }
}
