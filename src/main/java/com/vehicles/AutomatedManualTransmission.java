/*
 * Author Name : Jaswanth Sai
 * Date : 8/30/2022
 * Created With: INTELLIJ IDEA COMMUNITY EDITION
 */
package com.vehicles;

public class AutomatedManualTransmission extends Transmission {
    private double[] allGearRatios;
    private int frontGears;

    public AutomatedManualTransmission() {
    }

    public AutomatedManualTransmission(String modelNumber) {
        super(modelNumber);
        if (modelNumber.equals("AMTP4")) {
            this.frontGears = 4;
            this.allGearRatios = new double[]{2.540, 1.920, 1510, 1.000};
        } else if (modelNumber.equals("AMTD5")) {
            this.frontGears = 5;
            this.allGearRatios = new double[]{2.950, 1.940, 1.340, 1.000, 0.630};
        }

    }
}
