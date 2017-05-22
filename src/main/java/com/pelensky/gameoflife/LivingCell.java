package com.pelensky.gameoflife;

public class LivingCell implements Cell {
    private final int underpopulation = 2;
    private final int overpopulation = 3;

    @Override
    public boolean isAlive() {
        return true;
    }

    @Override
    public Cell nextGeneration(int neighbours) {
        if (neighbours >= underpopulation && neighbours <= overpopulation ) {
            return new LivingCell();
        } else {
            return new NotLivingCell();
        }

    }
}
