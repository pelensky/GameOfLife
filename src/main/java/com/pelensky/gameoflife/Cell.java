package com.pelensky.gameoflife;

public interface Cell {
    boolean isAlive();
    Cell nextGeneration(int neighbours);
}
