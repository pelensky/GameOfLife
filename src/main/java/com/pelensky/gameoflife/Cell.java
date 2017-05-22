package com.pelensky.gameoflife;

class Cell {

    private boolean alive;

    Cell(boolean alive){
        this.alive = alive;
    }

    boolean isAlive() {
        return alive;
    }

    void setAlive(boolean alive) {
        this.alive = alive;
    }
}
