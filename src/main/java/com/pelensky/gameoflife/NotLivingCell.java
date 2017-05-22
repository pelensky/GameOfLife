package com.pelensky.gameoflife;

public class NotLivingCell implements Cell {
    @Override
    public boolean isAlive() {
        return false;
    }
}
