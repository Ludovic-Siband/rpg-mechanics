package Model.Equipment.Weapons;

import Model.Equipment.Weapon;
import lombok.Data;

@Data
public class Staff extends Weapon {


    public Staff(String name, int weight, double price, String type,int PowerAttack) {
        super(name, weight, price, type, PowerAttack );
    }
    @Override
    public String toString() {
        return super.toString();
    }
}
