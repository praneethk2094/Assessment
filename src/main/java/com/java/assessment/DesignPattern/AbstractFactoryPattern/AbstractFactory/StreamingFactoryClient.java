package com.java.assessment.DesignPattern.AbstractFactoryPattern.AbstractFactory;

import com.java.assessment.DesignPattern.AbstractFactoryPattern.HuluClasses.HuluPackage;
import com.java.assessment.DesignPattern.FactoryPattern.ConcreteClasses.Package;

/**
 * Client class for the streaming service, where the client can choose his Streaming service and
 * get the package details depending on his budget or transaction ID.
 */
public class StreamingFactoryClient {
    public static void main(String[] args) {
        StreamingFactoryClient afc = new StreamingFactoryClient();
        //Choose the required streaming service and get subscribed package details
        StreamingFactory huluFactory = StreamingFactory.StreamingService(StreamingFactory.StreamingService.HULU);
        afc.printHulu(huluFactory.packageHuluDetails("1/Bruce Banner/20170525"));
        StreamingFactory netflixFactory = StreamingFactory.StreamingService(StreamingFactory.StreamingService.NETFLIX);
        afc.printNetflix(netflixFactory.packageDetails("1/Peter Parker/20171015"));

        //Choose the required streaming service and get package details depending on budget.
        StreamingFactory huluFactory2 = StreamingFactory.StreamingService(StreamingFactory.StreamingService.HULU);
        afc.printHulu(huluFactory2.selectHuluPackage(20));
        StreamingFactory netflixFactory2 = StreamingFactory.StreamingService(StreamingFactory.StreamingService.NETFLIX);
        afc.printNetflix(netflixFactory2.selectPackage(15));
    }

    //Helper method to print Netflix package details.
    private void printNetflix(Package subscription) {
        System.out.println(
                subscription.getType() + "{" +
                        "cost=" + subscription.getCost() +
                        ", timeline='" + subscription.getTimeline() + "\'" +
                        ", screens=" + subscription.getScreens() +
                        ", subscriptionDetails=" + subscription.getSubscriptionDetails() +
                        '}'
        );
    }

    //Helper method to print Hulu package details.
    private void printHulu(HuluPackage subscription) {
        System.out.println(
                subscription.getType() + "{" +
                        "cost=" + subscription.getCost() +
                        ", timeline='" + subscription.getTimeline() + "\'" +
                        ", screens=" + subscription.getScreens() +
                        ", subscriptionDetails=" + subscription.getHuluSubscriptionDetails() +
                        '}'
        );
    }
}
