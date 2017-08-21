package com.java.assessment.DesignPattern.AbstractFactoryPattern.HuluClasses;

/**
 * Hulu Package Silver with custom details.
 * Implements HuluPackage Interface
 */
public class Silver implements HuluPackage {
    private String type = "Silver";
    private double cost = 15.99;
    private String timeline = "2 Months";
    private int screens = 2;
    private HuluSubscriptionDetails huluSubscriptionDetails = null;

    public Silver(HuluSubscriptionDetails huluSubscriptionDetails) {
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
