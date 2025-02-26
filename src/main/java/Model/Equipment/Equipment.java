package Model.Equipment;

import lombok.Data;

@Data
public abstract class Equipment {
    public String name;
    public int  weight;
    public double price;
}

