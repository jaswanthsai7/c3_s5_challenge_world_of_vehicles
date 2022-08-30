/*
 * Author Name : Jaswanth Sai
 * Date : 8/30/2022
 * Created With: INTELLIJ IDEA COMMUNITY EDITION
 */
package com.vehicles;

public class AutomatedManualTransmission extends Transmission {

    private float gear1Ratio;
    private float gear2Ratio;
    private float gear3Ratio;
    private float gear4Ratio;
    private float gear5Ratio;
    private float gear6Ratio;

    public AutomatedManualTransmission(String modelNumber, int forwardGears, float gear1Ratio, float gear2Ratio, float gear3Ratio, float gear4Ratio) {
        super(modelNumber, forwardGears);
        if ("AMTP4".equals(modelNumber))
            this.gear1Ratio = 2.520f;
        this.gear2Ratio = 1.920f;
        this.gear3Ratio = 1.510f;
        this.gear4Ratio = 1.000f;
    }

    public AutomatedManualTransmission(String modelNumber, int forwardGears, float gear1Ratio, float gear2Ratio, float gear3Ratio, float gear4Ratio, float gear5Ratio) {
        super(modelNumber, forwardGears);
        if ("AMDP5".equals(modelNumber))
            this.gear1Ratio = 2.950f;
        this.gear2Ratio = 1.930f;
        this.gear3Ratio = 1.340f;
        this.gear4Ratio = 1.000f;
        this.gear5Ratio = 0.630f;
    }

    @Override
    public String toString() {
        return "AutomatedManualTransmission{" +
                "gear1Ratio=" + gear1Ratio +
                ", gear2Ratio=" + gear2Ratio +
                ", gear3Ratio=" + gear3Ratio +
                ", gear4Ratio=" + gear4Ratio +
                "} " + super.toString();
    }
}
