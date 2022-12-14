/*
 * Author Name : Jaswanth Sai
 * Date : 8/30/2022
 * Created With: INTELLIJ IDEA COMMUNITY EDITION
 */
package com.vehicles;

public class VehicleImpl {
    public static void main(String[] args) {
        // declare and initialise the values to an object
        ManualTransmission manualTransmission = new ManualTransmission("MD6");
        AutomatedManualTransmission automatedManualTransmission = new AutomatedManualTransmission("AMTD5");
        AutomaticCVT automaticCVT = new AutomaticCVT("CVT6");
        AutomaticDCT automaticDCT = new AutomaticDCT("DCT8");
        // print by calling method
        manualTransmission.showSpecs();
        System.out.println("--------------------------------------------------\n");
        automatedManualTransmission.showSpecs();
        System.out.println("--------------------------------------------------\n");
        automaticCVT.showSpecs();
        System.out.println("--------------------------------------------------\n");
        automaticDCT.showSpecs();


    }

}
