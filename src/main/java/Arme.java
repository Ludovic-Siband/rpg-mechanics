import lombok.Data;

@Data
public class Arme extends Equipement {
    private String type;
    private int PowerAttack;

    public Arme (String name, int weight, double price,String type,int PowerAttack ) {
        super(name, weight, price);
        this.type = type;
        this.PowerAttack = PowerAttack;
    }

    @Override
    public String toString() {
        return  "Mon Arme s'appelle  " + this.name + " elle pese  " + this.weight + " kg "+" elle coute  " + this.price + " piece d'or "+" elle est de type  " + this.type + " elle fait " + this.PowerAttack + " de degats";
    }
}
