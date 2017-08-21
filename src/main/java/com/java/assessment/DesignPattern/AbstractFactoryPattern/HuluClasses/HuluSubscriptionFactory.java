package com.java.assessment.DesignPattern.AbstractFactoryPattern.HuluClasses;

import com.java.assessment.DesignPattern.AbstractFactoryPattern.AbstractFactory.StreamingFactory;
import com.java.assessment.DesignPattern.Exception.TransactionException;
import com.java.assessment.DesignPattern.FactoryPattern.NetflixClasses.Package;

/**
 * Hulu Subscription Factory that generates the required instances depending on the user needs.
 * The factory abstracts the complexities such as dependencies or database connections required
 * to create an object.
 */
public class HuluSubscriptionFactory extends StreamingFactory {

    /**
     * Method that returns the package details depending on the clients budget.
     */
    @Override
    public HuluPackage selectHuluPackage(double budget) {
        HuluSubscriptionDetails huluSubscriptionDetails = new HuluSubscriptionDetails();
        if (budget > 15 && budget < 25) return new Silver(huluSubscriptionDetails);
        else return new Gold(huluSubscriptionDetails);
    }

    /**
     * Method that returns the package details the client is currently subscribed to
     * depending on the transactionId
     */
    @Override
    public HuluPackage huluPackageDetails(String transactionId) {
        String[] data = transactionId.split("/");
        int selection = 0;
        if (data[0].equals("1")) selection = 1;
        if (data[0].equals("2")) selection = 2;
        HuluSubscriptionDetails huluSubscriptionDetails = new HuluSubscriptionDetails(data[1], data[2]);
        System.out.println(huluSubscriptionDetails);
        HuluPackage selected = null;
        switch (selection) {
            case 1:
                selected = new Gold(huluSubscriptionDetails);
                break;
            case 2:
                selected = new Silver(huluSubscriptionDetails);
                break;
            default:
                try {
                    throw new TransactionException("The transaction number is invalid");
                } catch (TransactionException e) {
                    e.printStackTrace();
                }
        }
        return selected;
    }

    @Override
    public Package selectNetflixPackage(double budget) {
        return null;
    }

    @Override
    public Package netflixPackageDetails(String transactionId) {
        return null;
    }
}

