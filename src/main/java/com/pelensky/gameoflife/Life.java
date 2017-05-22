package com.pelensky.gameoflife;

import java.util.List;

class Life {

    private final List<List<Cell>> grid;

    Life(List<List<Cell>> grid){
        this.grid = grid;
    }

    List<List<Cell>> getGrid(){
        return grid;
    }


}
