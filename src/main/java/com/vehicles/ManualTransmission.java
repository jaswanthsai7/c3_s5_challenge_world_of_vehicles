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

    public float getGear1Ratio() {
        return gear1Ratio;
    }

    public void setGear1Ratio(float gear1Ratio) {
        this.gear1Ratio = gear1Ratio;
    }

    public float getGear2ratio() {
        return gear2ratio;
    }

    public void setGear2ratio(float gear2ratio) {
        this.gear2ratio = gear2ratio;
    }

    public float getGear3ratio() {
        return gear3ratio;
    }

    public void setGear3ratio(float gear3ratio) {
        this.gear3ratio = gear3ratio;
    }

    public float getGear4ratio() {
        return gear4ratio;
    }

    public void setGear4ratio(float gear4ratio) {
        this.gear4ratio = gear4ratio;
    }

    @Override
    public String toString() {
        return "ManualTransmission{" +
                "gear1Ratio=" + gear1Ratio +
                ", gear2ratio=" + gear2ratio +
                ", gear3ratio=" + gear3ratio +
                ", gear4ratio=" + gear4ratio +
                "} " + super.toString();
    }
}
