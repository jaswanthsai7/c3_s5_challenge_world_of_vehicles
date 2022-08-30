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

    public AutomaticCVT(String modelNumber, double[] allGearRatios, int forwardGears) {
        super(modelNumber);
        this.allGearRatios = new double[]{2.631, 1.440, 1.165, 0.960, 0.680, 0.499};
        this.forwardGears = 6;
    }
}
