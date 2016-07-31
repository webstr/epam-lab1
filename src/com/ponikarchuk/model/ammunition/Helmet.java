package com.ponikarchuk.model.ammunition;

public class Helmet extends Ammunition {
    private int size;

    public Helmet(int weight, int price) {
        this.name = "Helmet";
        this.weight = weight;
        this.price = price;
        this.size = 0;
    }

    public Helmet(int weight, int price, int size) {
        this.name = "Helmet";
        this.weight = weight;
        this.price = price;
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
