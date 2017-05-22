package com.pelensky.gameoflife;

import java.util.ArrayList;
import java.util.List;

class Life {

    private final List<List<Cell>> grid;

    Life(List<List<Cell>> grid){
        this.grid = grid;
    }

    List<List<Cell>> getGrid(){
        return grid;
    }

    List<List<Integer>> countLiveNeighbours() {
        List<List<Integer>> liveNeighbours = new ArrayList<>();
        for (int row = 0; row < getGrid().size(); row++){
            List<Integer> liveNeighboursRow = new ArrayList<>();
            for (int column = 0; column < getGrid().get(row).size(); column++){
                liveNeighboursRow.add(count(row, column));
            }
            liveNeighbours.add(liveNeighboursRow);
        }
        return liveNeighbours;
    }

    private Integer count(int row, int cell) {
        boolean belowLeft = checkLifeStatus(row - 1, cell - 1);
        boolean below = checkLifeStatus(row - 1, cell);
        boolean belowRight = checkLifeStatus(row - 1, cell + 1);
        boolean left = checkLifeStatus(row, cell - 1);
        boolean right = checkLifeStatus(row, cell + 1);
        boolean aboveLeft = checkLifeStatus(row + 1, cell - 1);
        boolean above = checkLifeStatus(row + 1, cell);
        boolean aboveRight = checkLifeStatus(row + 1, cell + 1);
        Integer counter = 0;
        if (belowLeft) counter += 1;
        if (below) counter += 1;
        if (belowRight) counter += 1;
        if (left) counter += 1;
        if (right) counter += 1;
        if (aboveLeft) counter += 1;
        if (above) counter += 1;
        if (aboveRight) counter += 1;
        return counter;
    }

    private boolean checkLifeStatus(int row, int cell) {
        if ((row < 0) || (cell < 0)) {
            return false;
        } else if (row >= getGrid().size() || cell >= getGrid().size()) {
            return false;
        } else {
                return getGrid().get(row).get(cell).isAlive();
            }
        }
    }



