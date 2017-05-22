package com.pelensky.gameoflife;

public class NotLivingCell implements Cell {
    private int reproduction = 3;

    @Override
    public boolean isAlive() {
        return false;
    }

    @Override
    public Cell nextGeneration(int neighbours) {
        if (neighbours == reproduction){
            return new LivingCell();
        } else {
            return new NotLivingCell();
        }
    }
}
