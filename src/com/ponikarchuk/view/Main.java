package com.ponikarchuk.view;

import com.ponikarchuk.controller.action.Action;
import com.ponikarchuk.model.ammunition.Ammunition;
import com.ponikarchuk.controller.builder.Builder;
import com.ponikarchuk.controller.builder.Director;
import com.ponikarchuk.model.knight.Knight;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Director director = new Director(10, 20, 40, 150, 5, 10);
        Builder builder = new Builder(director);
        Knight knight = builder.buildKnight();

        Action action = new Action();
        System.out.println("Summary price " + action.getKnightsAmmunitionPrice(knight) + "\n");

        List<Ammunition> list = action.sortAmmunitionWeight(knight);
        System.out.println("Sorted by weight");
        for (Ammunition am : list) {
            System.out.println(am.getName() + " " + am.getWeight());
        }
        System.out.println();

        int priceLower = 7;
        int priceHigher = 30;
        List<Ammunition> list2 = action.getWithinPrice(knight, priceLower, priceHigher);
        System.out.println("Ammunition within prices " + priceLower + " " + priceHigher);
        for (Ammunition am : list2) {
            System.out.println(am.getName() + " " + am.getPrice());
        }
    }
}
