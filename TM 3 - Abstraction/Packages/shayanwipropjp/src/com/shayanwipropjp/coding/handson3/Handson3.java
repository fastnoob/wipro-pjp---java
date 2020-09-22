package com.shayanwipropjp.coding.handson3;

import com.automobile.twowheeler.Honda;
import com.automobile.twowheeler.Hero;

public class Handson3 {

    public static void main(String[] args) {
        Hero hero = new Hero("BIKE X", "ABCD1234", "SHAYAN SAHA", 50);
        hero.getModelName();
        hero.getOwnerName();
        hero.getRegistrationNumber();
        hero.getSpeed();
        hero.radio();

        System.out.println();

        Honda honda = new Honda("HONDA X", "XYZ1234", "IRIN BANIK", 50);
        honda.getModelName();
        honda.getOwnerName();
        honda.getRegistrationNumber();
        honda.getSpeed();
        honda.cdplayer();

    }

}
