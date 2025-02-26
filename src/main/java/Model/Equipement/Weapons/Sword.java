package Model.Equipement.Weapons;

import Model.Equipement.Arme;
import lombok.Data;

@Data
public class Sword extends Arme {
    public Sword(String name, int weight, double price, String type, int PowerAttack) {
        super(name, weight, price, type, PowerAttack);
    }
    @Override
    public String toString() {
        return super.toString();
    }

}
