package com.ponikarchuk.controller.builder;

import com.ponikarchuk.model.ammunition.Armor;
import com.ponikarchuk.model.ammunition.Boots;
import com.ponikarchuk.model.ammunition.Helmet;
import com.ponikarchuk.model.knight.Knight;

public class Director {
    private int helmetWeight;
    private int helmetPrice;
    private int armorWeight;
    private int armorPrice;
    private int bootsWeight;
    private int bootsPrice;

    /**
     * Setup parameters to create knight
     * @param helmetWeight weight of helmet
     * @param helmetPrice price of helmet
     * @param armorWeight weight of armor
     * @param armorPrice price of armor
     * @param bootsWeight weight of boots
     * @param bootsPrice price of boots
     */
    public Director(int helmetWeight, int helmetPrice, int armorWeight, int armorPrice, int bootsWeight, int bootsPrice) {
        this.helmetWeight = helmetWeight;
        this.helmetPrice = helmetPrice;
        this.armorWeight = armorWeight;
        this.armorPrice = armorPrice;
        this.bootsWeight = bootsWeight;
        this.bootsPrice = bootsPrice;
    }

    /**
     * Build knight by director's parameters
     * @param knight knight that builds
     */
    public void build(Knight knight) {
        knight.setHelmet(new Helmet(helmetWeight, helmetPrice));
        knight.setArmor(new Armor(armorWeight, armorPrice));
        knight.setBoots(new Boots(bootsWeight, bootsPrice));
    }
}
