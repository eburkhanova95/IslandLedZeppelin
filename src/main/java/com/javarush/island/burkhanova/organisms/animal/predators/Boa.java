package com.javarush.island.burkhanova.organisms.animal.predators;

import com.javarush.island.burkhanova.organisms.animal.AnimalProperties;

public class Boa extends Predator {
    private static final AnimalProperties BOA_PROPERTY = new AnimalProperties(15,30,1,3);

    public Boa() {
        super("Boa", "\uD83D\uDC0D", BOA_PROPERTY);
    }
}
