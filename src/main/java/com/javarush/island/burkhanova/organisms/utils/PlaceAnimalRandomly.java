package com.javarush.island.burkhanova.organisms.utils;

import com.javarush.island.burkhanova.island.Island;
import com.javarush.island.burkhanova.island.Location;
import com.javarush.island.burkhanova.organisms.Organism;
import java.util.Random;

public class PlaceAnimalRandomly {
    public static void placeOrganismRandomly(Organism organism, Island island){
        Random random= new Random();

        int y = random.nextInt(island.getHeight());
        int x = random.nextInt(island.getWeight());

        Location startLocation = island.getLocation(y,x);
        organism.setCurrentLocation(startLocation);
        startLocation.addOrganism(organism);


    }
}
