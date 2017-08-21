package com.java.assessment.DesignPattern.AbstractFactoryPattern.HuluClasses;

/**
 * Hulu Package Gold with custom details.
 * Implements HuluPackage Interface
 */
public class Gold implements HuluPackage {
    private String type = "Gold";
    private double cost = 25.99;
    private String timeline = "2 Months";
    private int screens = 4;
    private HuluSubscriptionDetails huluSubscriptionDetails = null;

    public Gold(HuluSubscriptionDetails huluSubscriptionDetails) {
        this.huluSubscriptionDetails = huluSubscriptionDetails;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public double getCost() {
        return cost;
    }

    @Override
    public String getTimeline() {
        return timeline;
    }

    @Override
    public int getScreens() {
        return screens;
    }

    @Override
    public HuluSubscriptionDetails getHuluSubscriptionDetails() {
        return huluSubscriptionDetails;
    }
}
