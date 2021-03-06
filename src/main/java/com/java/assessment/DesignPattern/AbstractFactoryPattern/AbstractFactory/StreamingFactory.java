package com.java.assessment.DesignPattern.AbstractFactoryPattern.AbstractFactory;

import com.java.assessment.DesignPattern.AbstractFactoryPattern.HuluClasses.HuluPackage;
import com.java.assessment.DesignPattern.AbstractFactoryPattern.HuluClasses.HuluSubscriptionFactory;
import com.java.assessment.DesignPattern.FactoryPattern.NetflixClasses.NetflixFactory;
import com.java.assessment.DesignPattern.FactoryPattern.NetflixClasses.Package;

/**
 * Abstract Factory that return the required factory{HuluSubscriptionFactory or SubscriptionFactory}
 * depending on the clients requirement.
 */
public abstract class StreamingFactory {
    //Method to instantiate and return the required Streaming service depending on the clients requirement.
    protected static StreamingFactory StreamingService(StreamingService streamingService) {
        switch (streamingService) {
            case HULU:
                return new HuluSubscriptionFactory();
            case NETFLIX:
                return new NetflixFactory();
            default:
                return null;
        }
    }

    //Abstract methods implemented by the factory classes.
    public abstract Package selectNetflixPackage(double budget);

    public abstract Package netflixPackageDetails(String transactionId);

    public abstract HuluPackage selectHuluPackage(double budget);

    public abstract HuluPackage huluPackageDetails(String transactionId);

    public enum StreamingService {HULU, NETFLIX}
}
