package com.java.assessment.DesignPattern.FactoryPattern.NetflixClasses;

import com.java.assessment.DesignPattern.AbstractFactoryPattern.AbstractFactory.StreamingFactory;
import com.java.assessment.DesignPattern.AbstractFactoryPattern.HuluClasses.HuluPackage;
import com.java.assessment.DesignPattern.Exception.TransactionException;

/**
 * Netflix Factory that generates the required instances depending on the user needs.
 * The factory abstracts the complexities such as dependencies or database connections required
 * to create an object.
 */
public class NetflixFactory extends StreamingFactory {
    /**
     * Method that returns the package details depending on the clients budget.
     */
    public Package selectNetflixPackage(double budget) {
        SubscriptionDetails subscriptionDetails = new SubscriptionDetails();
        if (budget > 0 && budget < 9) return new Basic(subscriptionDetails);
        else if (budget > 9 && budget < 11) return new Standard(subscriptionDetails);
        else return new Premium(subscriptionDetails);

    }

    /**
     * Method that returns the package details the client is currently subscribed to
     * depending on the transactionId
     */
    public Package netflixPackageDetails(String transactionId) {
        String[] data = transactionId.split("/");
        int selection = 0;
        if (data[0].equals("1")) selection = 1;
        if (data[0].equals("2")) selection = 2;
        if (data[0].equals("3")) selection = 3;
        SubscriptionDetails subscriptionDetails = new SubscriptionDetails(data[1], data[2]);
        Package selected = null;
        switch (selection) {
            case 1:
                selected = new Premium(subscriptionDetails);
                break;
            case 2:
                selected = new Standard(subscriptionDetails);
                break;
            case 3:
                selected = new Basic(subscriptionDetails);
                break;
            default:
                try {
                    throw new TransactionException("The Transaction ID is invalid");
                } catch (TransactionException e) {
                    e.printStackTrace();
                }
                break;
        }
        return selected;
    }

    @Override
    public HuluPackage selectHuluPackage(double budget) {
        return null;
    }

    @Override
    public HuluPackage huluPackageDetails(String transactionId) {
        return null;
    }


}
