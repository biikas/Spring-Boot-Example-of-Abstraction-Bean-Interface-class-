package com.abstractionbeans.bikash3;

import com.abstractionbeans.bikash3.cinema.Cinema;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Starter implements CommandLineRunner {
//    @Autowired
//    @Qualifier("qfx")
//    private Cinema qfx1;
//
//    @Autowired
//    @Qualifier("iqcinema")
//    private Cinema iqcinema1;
//
//    @Autowired
//    @Qualifier("centralmultiplex")
//    private Cinema centralMultiplex1;
//
//    @Autowired
//    @Qualifier("citycinema")
//    private Cinema cityCinema1;

    private Cinema qfx1;
    private Cinema iqcinema1;
    private Cinema centralmultiplex1;
    private Cinema citycinema1;

    @Autowired
    public Starter(@Qualifier("qfx") Cinema qfx1,@Qualifier("iqcinema") Cinema iqcinema1,@Qualifier("centralmultiplex") Cinema centralmultiplex1,@Qualifier("citycinema") Cinema citycinema1) {
        this.qfx1 = qfx1;
        this.iqcinema1 = iqcinema1;
        this.centralmultiplex1 = centralmultiplex1;
        this.citycinema1 = citycinema1;
    }


    @Override
    public void run(String... args) throws Exception {
        System.out.println("Starter called");

        System.out.println("QFX");
        qfx1.displayRate();
        qfx1.displayFoodItems();
        qfx1.displayShows();
        System.out.println("");

        System.out.println("IQCinema");
        iqcinema1.displayRate();
        iqcinema1.displayFoodItems();
        iqcinema1.displayShows();
        System.out.println("");

        System.out.println("City Cinema");
        citycinema1.displayRate();
        citycinema1.displayFoodItems();
        citycinema1.displayShows();
        System.out.println("");

        System.out.println("Central Multiplex");
        centralmultiplex1.displayRate();
        centralmultiplex1.displayFoodItems();
        centralmultiplex1.displayShows();

    }


}
