package com.java.assessment.DesignPattern.FactoryPattern.NetflixClasses;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * NETFLIX Subscription Details with default values.
 * Can be customized according to the package.
 */

public class SubscriptionDetails {
    private String userName = "N/A";
    private LocalDate startDate = LocalDate.now();
    private LocalDate endDate = startDate.plusMonths(1);

    public SubscriptionDetails() {
    }

    public SubscriptionDetails(String userName, String startDate) {
        this.userName = userName;
        this.startDate = LocalDate.parse(startDate, DateTimeFormatter.BASIC_ISO_DATE);
        this.endDate = LocalDate.parse(startDate, DateTimeFormatter.BASIC_ISO_DATE).plusMonths(1);
    }

    @Override
    public String toString() {
        return "{" +
                "userName='" + userName + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                '}';
    }
}
