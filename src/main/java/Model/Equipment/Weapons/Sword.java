package Model.Equipment.Weapons;

import Model.Equipment.Weapon;
import lombok.Data;

@Data
public class Sword extends Weapon {
    public Sword(String name, int weight, double price, String type, int PowerAttack) {
        super(name, weight, price, type, PowerAttack);
    }
    @Override
    public String toString() {
        return super.toString();
    }

}
