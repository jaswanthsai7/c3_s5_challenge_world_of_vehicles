/*
 * Author Name : Jaswanth Sai
 * Date : 8/30/2022
 * Created With: INTELLIJ IDEA COMMUNITY EDITION
 */
package com.vehicles;

public class ManualTransmission extends Transmission {
    private float gear1Ratio;
    private float gear2ratio;
    private float gear3ratio;
    private float gear4ratio;

    public ManualTransmission() {
    }

    public ManualTransmission(String modelNumber, int forwardGears, float gear1Ratio, float gear2ratio, float gear3ratio, float gear4ratio) {
        super(modelNumber, forwardGears);
        this.gear1Ratio = gear1Ratio;
        this.gear2ratio = gear2ratio;
        this.gear3ratio = gear3ratio;
        this.gear4ratio = gear4ratio;
    }
}
