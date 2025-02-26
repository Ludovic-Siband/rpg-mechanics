package Equipement;

import lombok.Data;

@Data
public class Equipement {
    public String name;
    public int  weight;
    public double price;

    public Equipement(String name, int weight, double price) {
        this.name = name;
        this.weight = weight;
        this.price = price;
    }




}

