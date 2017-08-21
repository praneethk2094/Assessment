package com.java.assessment.DesignPattern.FactoryPattern;

import com.java.assessment.DesignPattern.FactoryPattern.NetflixClasses.Package;

/**
 * Client for Netflix subscription factory.
 * The client is abstracted from all the complexities and calculations required to
 * instantiate the required object.
 */
public class Client {
    public static void main(String[] args) {
        Client c = new Client();
        //Select the package depending on clients budget
        Package subscription = SubscriptionFactory.selectPackage(7.99);
        c.print(subscription);

        //Get the current subscription details depending on transaction ID
        Package subscription2 = SubscriptionFactory.packageDetails("1/Bruce/20170525");
        c.print(subscription2);
    }

    //Helper method to print the returned package
    private void print(Package subscription) {
        System.out.println(
                subscription.getType() + "{" +
                        "cost=" + subscription.getCost() +
                        ", timeline='" + subscription.getTimeline() + "\'" +
                        ", screens=" + subscription.getScreens() +
                        ", subscriptionDetails=" + subscription.getSubscriptionDetails() +
                        '}'
        );
    }
}
