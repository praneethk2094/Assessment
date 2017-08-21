package com.java.assessment.DesignPattern.FactoryPattern.NetflixClasses;

/**
 * Netflix Package Premium with custom details.
 * Implements Package Interface
 */
public class Premium implements Package {
    private String type = "Premium";
    private double cost = 11.99;
    private String timeline = "1 Month";
    private int screens = 4;
    private SubscriptionDetails subscriptionDetails;


    public Premium(SubscriptionDetails subscriptionDetails) {
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
