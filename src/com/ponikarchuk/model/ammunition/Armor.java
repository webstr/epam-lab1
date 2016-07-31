package com.ponikarchuk.model.ammunition;

public class Armor extends Ammunition {
    private int thickness;

    public Armor(int weight, int price) {
        this.name = "Armor";
        this.weight = weight;
        this.price = price;
        this.thickness = 0;
    }

    public Armor(int weight, int price, int thickness) {
        this.name = "Armor";
        this.weight = weight;
        this.price = price;
        this.thickness = 0;
    }

    public int getThickness() {
        return thickness;
    }

    public void setThickness(int thickness) {
        this.thickness = thickness;
    }
}
