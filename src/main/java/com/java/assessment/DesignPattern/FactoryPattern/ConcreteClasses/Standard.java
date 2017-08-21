package com.java.assessment.DesignPattern.FactoryPattern.ConcreteClasses;

/**
 * Netflix Package Standard with custom details.
 * Implements Package Interface
 */
public class Standard implements Package {
    private String type = "Standard";
    private double cost = 9.99;
    private String timeline = "1 Month";
    private int screens = 2;
    private SubscriptionDetails subscriptionDetails;

    public Standard(SubscriptionDetails subscriptionDetails) {
        this.subscriptionDetails = subscriptionDetails;
    }


    public SubscriptionDetails getSubscriptionDetails() {
        return subscriptionDetails;
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
}
