package com.shayanwipropjp.coding.handson4;

import com.automobile.fourwheelers.Ford;
import com.automobile.fourwheelers.Logan;

public class Handson4 {

    public static void main(String[] args) {
        Logan logan = new Logan("Logan XYZ", "ABCD1234", "SHAYAN SAHA", 100, 1);
        logan.getModelName();
        logan.getOwnerName();
        logan.getRegistrationNumber();
        logan.speed();
        System.out.println("Has GPS? " + logan.gps());

        System.out.println();

        Ford ford = new Ford("FIGO", "XYZ1234", "IRIN BANIK", 100, 1);
        ford.getModelName();
        ford.getOwnerName();
        ford.getRegistrationNumber();
        ford.speed();
        System.out.println("Has AC? " + ford.tempControl());
    }

}
