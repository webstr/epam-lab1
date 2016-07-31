package com.ponikarchuk.model.ammunition;

public abstract class Ammunition {
    protected String name;
    protected int weight;
    protected int price;

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }
}
