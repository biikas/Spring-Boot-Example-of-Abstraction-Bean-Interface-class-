package com.abstractionbeans.bikash3.cinema;

import org.springframework.stereotype.Component;

@Component("qfx")
public class QFX implements Cinema{
    @Override
    public void displayRate() {
        System.out.println("Rs.480/-");
    }

    @Override
    public void displayShows() {
        System.out.println("No any shows available");
    }

    @Override
    public void displayFoodItems() {
        System.out.println("NAME OF FOOD ITEMS");
    }
}
