package com.pelensky.gameoflife;

import java.util.List;

class Life {

    private List<List<Cell>> grid;

    Life(Grid cellGrid){
        this.grid = cellGrid.getCellGrid();
    }

    List<List<Cell>> getGrid(){
        return grid;
    }

}
