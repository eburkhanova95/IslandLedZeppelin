package com.javarush.island.burkhanova.organisms.animal.herbivores;

import com.javarush.island.burkhanova.organisms.animal.AnimalProperties;

public class Horse extends Herbivorous {
    private static final AnimalProperties HORSE_PROPERTY = new AnimalProperties(400,20,4,60);

    public Horse() {
        super("Horse", "\uD83D\uDC34", HORSE_PROPERTY);
    }
}
