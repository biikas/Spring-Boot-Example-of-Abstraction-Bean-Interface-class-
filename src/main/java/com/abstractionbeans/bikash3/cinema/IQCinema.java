package com.abstractionbeans.bikash3.cinema;

import org.springframework.stereotype.Component;

@Component("iqcinema")
public class IQCinema implements Cinema{
    @Override
    public void displayRate() {
        System.out.println("Rs.500/-");
    }

    @Override
    public void displayShows() {
        System.out.println("No any shows available");
    }

    @Override
    public void displayFoodItems() {
        System.out.println("Food items");
    }
}
