/*
 * Author Name : Jaswanth Sai
 * Date : 8/30/2022
 * Created With: INTELLIJ IDEA COMMUNITY EDITION
 */
package com.vehicles;

public class ManualTransmission extends Transmission {
    private double[] allGearRatios;
    private int forwardGears;

    public ManualTransmission() {
    }

    public ManualTransmission(String modelNumber) {
        super(modelNumber);
        if ("MP4".equals(modelNumber)) {
            this.allGearRatios = new double[]{2.540, 1.920, 1.510, 1.000};
            this.forwardGears = 4;
        } else if ("MP5".equals(modelNumber)) {
            this.allGearRatios = new double[]{3.545, 1.904, 1.280, 0.914, 0.757};
            this.forwardGears = 5;
        } else if ("MP6".equals(modelNumber)) {
            this.forwardGears = 6;
            this.allGearRatios = new double[]{3.010, 2.070, 1.430, 1.000, 0.710, 0.570};
        } else if ("MD5".equals(modelNumber)) {
            this.forwardGears = 5;
            this.allGearRatios = new double[]{3.545, 1.940, 1.233, 0.911, 0.725};
        } else if ("MD6".equals(modelNumber)) {
            this.forwardGears = 6;
            this.allGearRatios = new double[]{3.640, 2.150, 1.360, 1.000, 0.750, 0.630};
        }
    }

    public void showSpecs() {
        if (allGearRatios.length == 5 && "MP5".equals(getModelNumber())) {
            System.out.println("Transmission Name : Manual Transmission");
            System.out.println("Transmission Model Number : MP5");
            System.out.println(" 1) Forward Gears " + forwardGears);
            System.out.println("1) Forward Gears " + forwardGears);
            for (int i = 0; i < allGearRatios.length; i++) {
                System.out.println((i + 2) + ") " + (i + 1) + "Gear Ratio " + allGearRatios[i] + "0");
            }
        } else if (allGearRatios.length == 4 && "MP4".equals(getModelNumber())) {
            System.out.println("Transmission Name : Manual Transmission");
            System.out.println("Transmission Model Number : MP4");
            System.out.println(" 1) Forward Gears " + forwardGears);
            System.out.println("1) Forward Gears " + forwardGears);
            for (int i = 0; i < allGearRatios.length; i++) {
                System.out.println((i + 2) + ") " + (i + 1) + "Gear Ratio " + allGearRatios[i] + "0");
            }
        } else if (allGearRatios.length == 4 && "MP4".equals(getModelNumber())) {
            System.out.println("Transmission Name : Manual Transmission");
            System.out.println("Transmission Model Number : MP4");
            System.out.println(" 1) Forward Gears " + forwardGears);
            System.out.println("1) Forward Gears " + forwardGears);
            for (int i = 0; i < allGearRatios.length; i++) {
                System.out.println((i + 2) + ") " + (i + 1) + "Gear Ratio " + allGearRatios[i] + "0");
            }
        } else if (allGearRatios.length == 6 && "MP6".equals(getModelNumber())) {
            System.out.println("Transmission Name : Manual Transmission");
            System.out.println("Transmission Model Number : MP6");
            System.out.println(" 1) Forward Gears " + forwardGears);
            System.out.println("1) Forward Gears " + forwardGears);
            for (int i = 0; i < allGearRatios.length; i++) {
                System.out.println((i + 2) + ") " + (i + 1) + "Gear Ratio " + allGearRatios[i] + "0");
            }
        } else if (allGearRatios.length == 6 && "MD6".equals(getModelNumber())) {
            System.out.println("Transmission Name : Manual Transmission");
            System.out.println("Transmission Model Number : MD6");
            System.out.println(" 1) Forward Gears " + forwardGears);
            System.out.println("1) Forward Gears " + forwardGears);
            for (int i = 0; i < allGearRatios.length; i++) {
                System.out.println((i + 2) + ") " + (i + 1) + "Gear Ratio " + allGearRatios[i] + "0");
            }
        } else if (allGearRatios.length == 5 && "MD5".equals(getModelNumber())) {
            System.out.println("Transmission Name : Manual Transmission");
            System.out.println("Transmission Model Number : MD5");
            System.out.println("1) Forward Gears " + forwardGears);
            for (int i = 0; i < allGearRatios.length; i++) {
                System.out.println((i + 2) + ") " + (i + 1) + "Gear Ratio " + allGearRatios[i] + "0");
            }
        }
    }
}
