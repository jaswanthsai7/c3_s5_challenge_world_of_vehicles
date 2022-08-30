/*
 * Author Name : Jaswanth Sai
 * Date : 8/30/2022
 * Created With: INTELLIJ IDEA COMMUNITY EDITION
 */
package com.vehicles;

public class Transmission {
    private String modelNumber;
    private int forwardGears;

    public Transmission() {
    }

    public Transmission(String modelNumber, int forwardGears) {
        this.modelNumber = modelNumber;
        this.forwardGears = forwardGears;
    }

    public String getModelNumber() {
        return modelNumber;
    }

    public void setModelNumber(String modelNumber) {
        this.modelNumber = modelNumber;
    }

    public int getForwardGears() {
        return forwardGears;
    }

    public void setForwardGears(int forwardGears) {
        this.forwardGears = forwardGears;
    }

    @Override
    public String toString() {
        return "Transmission{" +
                "modelNumber='" + modelNumber + '\'' +
                ", forwardGears=" + forwardGears +
                '}';
    }
}
