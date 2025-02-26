package Model.Equipement.Weapons;

import Model.Equipement.Arme;
import lombok.Data;


@Data
public class Bow extends Arme {

    public Bow (String name, int weight, double price, String type, int PowerAttack) {
        super(name, weight, price, type, PowerAttack);

    }
    @Override
    public String toString() {
        return super.toString();
    }
}
