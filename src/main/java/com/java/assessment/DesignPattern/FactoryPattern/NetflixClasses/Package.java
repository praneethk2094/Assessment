package com.java.assessment.DesignPattern.FactoryPattern.NetflixClasses;

/**
 * Netflix Package interface
 */
public interface Package {
    String getType();

    double getCost();

    String getTimeline();

    int getScreens();

    SubscriptionDetails getSubscriptionDetails();
}
