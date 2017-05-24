package com.pelensky.gameoflife;

public class NotLivingCell implements Cell {

    @Override
    public boolean isAlive() {
        return false;
    }

    @Override
    public Cell nextGeneration(int neighbours) {
        final int reproduction = 3;
        if (neighbours == reproduction){
            return new LivingCell();
        } else {
            return new NotLivingCell();
        }
    }

    @Override
    public String marker() {
        return " ";
    }
}
