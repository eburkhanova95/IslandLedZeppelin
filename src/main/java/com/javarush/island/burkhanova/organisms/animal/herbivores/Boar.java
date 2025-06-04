package com.javarush.island.burkhanova.organisms.animal.herbivores;

import com.javarush.island.burkhanova.organisms.animal.AnimalProperties;
import com.javarush.island.burkhanova.organisms.animal.predators.Wolf;

public class Boar extends Herbivorous{
    private static final AnimalProperties BOAR_PROPERTY = new AnimalProperties(400,50,2,50);

    public Boar() {
        super("Boar", "\uD83E\uDD9B", BOAR_PROPERTY);
    }


}
