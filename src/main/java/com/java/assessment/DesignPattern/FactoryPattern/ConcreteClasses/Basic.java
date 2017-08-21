package com.java.assessment.DesignPattern.FactoryPattern.ConcreteClasses;

/**
 * Netflix Package Basic with custom details.
 * Implements Package Interface
 */
public class Basic implements Package {
    private String type = "Basic";
    private double cost = 7.99;
    private String timeline = "1 Month";
    private int screens = 1;
    private SubscriptionDetails subscriptionDetails;


    public Basic(SubscriptionDetails subscriptionDetails) {
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
