package com.java.assessment.DesignPattern.AbstractFactoryPattern.HuluClasses;

/**
 * Hulu Package interface
 */
public interface HuluPackage {
    String getType();

    double getCost();

    String getTimeline();

    int getScreens();

    HuluSubscriptionDetails getHuluSubscriptionDetails();
}
