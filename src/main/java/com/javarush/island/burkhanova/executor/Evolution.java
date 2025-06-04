package com.javarush.island.burkhanova.executor;

import com.javarush.island.burkhanova.island.Island;
import com.javarush.island.burkhanova.organisms.Organism;
import com.javarush.island.burkhanova.organisms.OrganismProperties;

import java.util.concurrent.*;
import java.util.List;

public class Evolution<T extends Organism<? extends OrganismProperties>> {

    private final Island island;

    public Evolution(Island island) {
        this.island = island;
    }

    public void startEvolution(Island island, List<T> organisms) {
        if (organisms == null || organisms.isEmpty()) {
            throw new IllegalArgumentException("Organisms list cannot be null or empty");
        }
        ExecutorService executor = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());

        try {
            // Submit each organism task to the executor
            for (Organism organism : organisms) {
                executor.submit(() -> {
                    try {
                        organism.act(island);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                });
            }


            executor.shutdown();
            if (!executor.awaitTermination(5, TimeUnit.SECONDS)) {
                executor.shutdownNow();
            }


            synchronized (island) {
                island.printMap();
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.err.println("Evolution interrupted while awaiting termination");
        } finally {
            if (!executor.isTerminated()) {
                executor.shutdownNow();
            }
        }
    }

    public Island getIsland() {
        return island;
    }
}

