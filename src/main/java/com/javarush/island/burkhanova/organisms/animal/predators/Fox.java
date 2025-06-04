package com.javarush.island.burkhanova.organisms.animal.predators;

import com.javarush.island.burkhanova.organisms.animal.AnimalProperties;

public class Fox extends Predator{
    private static final AnimalProperties FOX_PROPERTY = new AnimalProperties(8,30,2,2);

    public Fox() {
        super("Fox", "\uD83E\uDD8A", FOX_PROPERTY);
    }


}


