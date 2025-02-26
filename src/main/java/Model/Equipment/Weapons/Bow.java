package Model.Equipment.Weapons;

import Model.Equipment.Weapon;
import lombok.Data;
import lombok.EqualsAndHashCode;


@EqualsAndHashCode(callSuper = true)
@Data
public class Bow extends Weapon {

    public Bow(String name, int weight, double price, String type, int PowerAttack) {
        this.name = name;
        this.weight = weight;
        this.price = price;
        this.type = type;
        this.PowerAttack = PowerAttack;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public void attack() {

    }
}
