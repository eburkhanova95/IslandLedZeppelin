package com.javarush.island.burkhanova.config;
import com.javarush.island.burkhanova.actions.FoodMapOrganism;

import java.util.Map;

public class FoodMapOrganismImpl implements FoodMapOrganism {
    private final Map<String, Integer> preyMap;

    public FoodMapOrganismImpl(Map<String, Integer> preyMap) {
        this.preyMap = preyMap;
    }

    @Override
    public int getFoodItem(String preyName) {
        return preyMap.getOrDefault(preyName, 0);
    }
}
