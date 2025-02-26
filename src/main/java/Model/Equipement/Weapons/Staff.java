package Model.Equipement.Weapons;

import Model.Equipement.Arme;
import lombok.Data;

@Data
public class Staff extends Arme {


    public Staff(String name, int weight, double price, String type,int PowerAttack) {
        super(name, weight, price, type, PowerAttack );
    }
    @Override
    public String toString() {
        return super.toString();
    }
}
