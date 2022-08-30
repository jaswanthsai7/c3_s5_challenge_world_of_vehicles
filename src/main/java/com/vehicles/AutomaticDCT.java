/*
 * Author Name : Jaswanth Sai
 * Date : 8/30/2022
 * Created With: INTELLIJ IDEA COMMUNITY EDITION
 */
package com.vehicles;

public class AutomaticDCT extends Transmission {
    private double[] allGearRatios;
    private int forwardGears;

    public AutomaticDCT() {
    }

    public AutomaticDCT(String modelNumber) {
        super(modelNumber);
        this.allGearRatios = new double[]{4.714, 3.143, 2.106, 1.667, 1.285, 1.000, 0.839, 0.667};
        this.forwardGears = allGearRatios.length;
    }

    public void showSpecs() {
        System.out.println("Transmission Name : AutomaticDCT");
        System.out.println("Transmission Model Number : " + getModelNumber());
        System.out.println("1) Forward Gears " + forwardGears);
        for (int i = 0; i < allGearRatios.length; i++) {
            System.out.println((i + 2) + ") " + (i + 1) + "Gear Ratio " + allGearRatios[i] + "0");
        }

    }
}
