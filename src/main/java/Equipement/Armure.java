package Equipement;

import lombok.Data;

@Data
public class Armure extends Equipement {
    private String type;
    private int defense;

    public Armure (String name, int weight, double price,String type, int defense) {
        super(name, weight, price);
        this.type = type;
        this.defense = defense;
    }

    @Override
    public String toString() {
        return "mon armure s'appelle " + this.name + " elle pese " + this.weight + " kg "+" elle coute " + this.price + " piece d'or "+ " c'est un " + this.type + " elle a " + this.defense +" de defenses" ;
    }
}
