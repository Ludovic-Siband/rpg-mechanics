package Model.Equipment;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public abstract class Armor extends Equipment {
    private String type;
    private int defense;

    @Override
    public String toString() {
        return "My armor is called " + this.name + ", it weighs " + this.weight + " kg, " + " it costs " + this.price + " gold coins, " + " it is a " + this.type + ", and it has " + this.defense + " defense points.";

    }
}
