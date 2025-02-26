package Model.Equipement;

import lombok.Data;

@Data
public abstract class Armure extends Equipement {
    private String type;
    private int defense;

    public Armure (String name, int weight, double price,String type, int defense) {
        super(name, weight, price);
        this.type = type;
        this.defense = defense;
    }

    @Override
    public String toString() {
        return "My armor is called " + this.name + ", it weighs " + this.weight + " kg, " + " it costs " + this.price + " gold coins, " + " it is a " + this.type + ", and it has " + this.defense + " defense points.";

    }
}
