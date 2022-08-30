/*
 * Author Name : Jaswanth Sai
 * Date : 8/30/2022
 * Created With: INTELLIJ IDEA COMMUNITY EDITION
 */
package com.vehicles;

public class AutomaticCVT extends Transmission {
    private double[] allGearRatios;
    private int forwardGears;

    public AutomaticCVT() {
    }

    public AutomaticCVT(String modelNumber) {
        super(modelNumber);
        this.allGearRatios = new double[]{2.631, 1.440, 1.165, 0.960, 0.680, 0.499};
        this.forwardGears = allGearRatios.length;
    }

    public void showSpecs() {
        System.out.println("Transmission Name : AutomaticCVT");
        System.out.println("Transmission Model Number : " + getModelNumber());
        System.out.println("1) Forward Gears " + forwardGears);
        for (int i = 0; i < allGearRatios.length; i++) {
            System.out.println((i + 2) + ") " + (i + 1) + "Gear Ratio " + allGearRatios[i] + "0");
        }

    }
}