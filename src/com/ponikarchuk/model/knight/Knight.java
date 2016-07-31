package com.ponikarchuk.model.knight;

import com.ponikarchuk.model.ammunition.Ammunition;
import com.ponikarchuk.model.ammunition.Armor;
import com.ponikarchuk.model.ammunition.Boots;
import com.ponikarchuk.model.ammunition.Helmet;

import java.util.ArrayList;
import java.util.List;

public class Knight {
    private Helmet helmet;
    private Armor armor;
    private Boots boots;

    public Knight() {
        helmet = null;
        armor = null;
        boots = null;
    }

    public Knight(Helmet helmet, Armor armor, Boots boots) {
        this.helmet = helmet;
        this.armor = armor;
        this.boots = boots;
    }

    public Helmet getHelmet() {
        return helmet;
    }

    public void setHelmet(Helmet helmet) {
        this.helmet = helmet;
    }

    public Armor getArmor() {
        return armor;
    }

    public void setArmor(Armor armor) {
        this.armor = armor;
    }

    public Boots getBoots() {
        return boots;
    }

    public void setBoots(Boots boots) {
        this.boots = boots;
    }

    /**
     * Create and return list of all knight's ammunition
     * @return list of knight's ammunition
     */
    public List<Ammunition> getAmmunition() {
        return new ArrayList<Ammunition>(){{add(helmet); add(armor); add(boots);}};
    }
}
