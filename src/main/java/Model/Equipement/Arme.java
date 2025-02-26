package Model.Equipement;

import lombok.Data;

@Data
public abstract class Arme extends Equipement {
    public String type;
   public int PowerAttack;

    public Arme(String name, int weight, double price, String type, int PowerAttack ) {
        super(name, weight, price);
        this.type = type;
        this.PowerAttack = PowerAttack;
    }
    @Override
    public String toString() {
        return "My weapon is called " + this.name + ", it weighs " + this.weight + " kg, " + " it costs " + this.price + " gold coins, " + " it is of type " + this.type + ", and it deals " + this.PowerAttack + " damage.";

    }
}
