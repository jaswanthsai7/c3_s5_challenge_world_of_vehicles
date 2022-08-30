/*
 * Author Name : Jaswanth Sai
 * Date : 8/30/2022
 * Created With: INTELLIJ IDEA COMMUNITY EDITION
 */
package com.vehicles;

public class AutomatedManualTransmission extends Transmission {
    private double[] allGearRatios;
    private int forwardGears;

    public AutomatedManualTransmission() {
    }

    public AutomatedManualTransmission(String modelNumber) {
        super(modelNumber);
        if (modelNumber.equals("AMTP4")) {
            this.forwardGears = 4;
            this.allGearRatios = new double[]{2.540, 1.920, 1510, 1.000};
        } else if (modelNumber.equals("AMTD5")) {
            this.forwardGears = 5;
            this.allGearRatios = new double[]{2.950, 1.940, 1.340, 1.000, 0.630};
        }

    }


    public void showSpec() {
        if (allGearRatios.length == 4) {
            System.out.println("Transmission Name : AutomatedManualTransmission");
            System.out.println("Transmission Model Number : AMTP4");
            System.out.println("1) Forward Gears " + forwardGears);
            for (int i = 0; i < allGearRatios.length; i++) {
                System.out.println((i + 2) + ")" + " Gear Ratio " + allGearRatios[i] + "0");
            }
        } else if (allGearRatios.length == 5) {
            System.out.println("Transmission Name : AutomatedManualTransmission");
            System.out.println("Transmission Model Number : AMTD5");
            System.out.println("1) Forward Gears " + forwardGears);
            for (int i = 0; i < allGearRatios.length; i++) {
                System.out.println((i + 2) + ")" + " Gear Ratio " + (allGearRatios[i]) + "0");

            }

        }
    }
}
