package com.pelensky.gameoflife;

class Cell {
    private boolean alive = false;

    boolean isAlive() {
        return alive;
    }

    void setAlive(boolean alive) {
        this.alive = alive;
    }
}
