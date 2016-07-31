package com.ponikarchuk.controller.action;

import com.ponikarchuk.model.ammunition.Ammunition;
import com.ponikarchuk.model.knight.Knight;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Action {

    /**
     * Find summary price of ammunition
     * @param knight knight that been use
     * @return summary price of ammunition
     */
    public int getKnightsAmmunitionPrice(Knight knight) {
        List<Ammunition> knightsAmmunition = knight.getAmmunition();
        int res = 0;
        for (Ammunition am : knightsAmmunition) {
            res += am.getPrice();
        }

        return res;
    }

    /**
     * Sort list of ammunition by weight
     * @param knight knight that been use
     * @return sorted list by weight field
     */
    public List<Ammunition> sortAmmunitionWeight(Knight knight) {
        List<Ammunition> result = knight.getAmmunition();

        Collections.sort(result, (o1, o2) -> {
            if (o1.getWeight() > o2.getWeight()) {
                return 1;
            } else {
                return -1;
            }
        });

        return result;
    }

    /**
     * Find and return list of all ammunition within lower and higher prices
     * @param knight knight that been use
     * @param priceLower lower price
     * @param priceHigher higher price
     * @return all ammunition within lower and higher prices
     */
    public List<Ammunition> getWithinPrice(Knight knight, int priceLower, int priceHigher) {
        List<Ammunition> knightsAmmunition = knight.getAmmunition();
        List<Ammunition> result = new ArrayList<>();

        for (Ammunition am : knightsAmmunition) {
            if (am.getPrice() >= priceLower && am.getPrice() <= priceHigher) {
                result.add(am);
            }
        }

        return result;
    }
}
