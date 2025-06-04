package com.javarush.island.burkhanova;

import com.javarush.island.burkhanova.executor.Evolution;
import com.javarush.island.burkhanova.executor.EvolutionScheduler;
import com.javarush.island.burkhanova.island.Island;

public class Runner {
    public static void main(String[] args) {
        Island island = new Island();
        island.populateRandomly();


        Evolution evolution = new Evolution(island);
        EvolutionScheduler scheduler = new EvolutionScheduler(island, evolution, 100);

        scheduler.start(500);

        try {
            Thread.sleep(120000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println("Main finished");
    }
}
