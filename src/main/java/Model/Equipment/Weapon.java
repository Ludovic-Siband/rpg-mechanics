package Model.Equipment;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public abstract class Weapon extends Equipment {
    public String type;
   public int PowerAttack;

    @Override
    public String toString() {
        return "My weapon is called " + this.name + ", it weighs " + this.weight + " kg, " + " it costs " + this.price + " gold coins, " + " it is of type " + this.type + ", and it deals " + this.PowerAttack + " damage.";

    }
}
