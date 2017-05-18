package com.pelensky.gameoflife;



import java.util.ArrayList;
import java.util.List;

class Grid {

    private final int numberOfRows;
    private final List<Cell> cells;

    Grid (int numberOfRows){
        this.numberOfRows = numberOfRows;
        this.cells = fillGrid();
    }

    private List<Cell> fillGrid(){
        List<Cell> grid = new ArrayList<>();
        for (int i = 0; i < numberOfRows * numberOfRows; i ++){
            grid.add(new Cell());
        }
        return grid;
    }

    List<Cell> getCells() {
        return cells;
    }



}
