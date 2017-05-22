package com.pelensky.gameoflife;

import java.util.ArrayList;
import java.util.List;

class Grid {

  private final int numberOfRows;
  private final List<List<Cell>> cellGrid;

  Grid(int numberOfRows) {
    this.numberOfRows = numberOfRows;
    this.cellGrid = fillGrid();
  }

 List<List<Cell>> getCellGrid() {
    return cellGrid;
  }

  private List<List<Cell>> fillGrid() {
    List<List<Cell>> grid = new ArrayList<>();
    for (int i = 0; i < numberOfRows; i++) {
      grid.add(fillRow());
    }
    return grid;
  }

  private List<Cell> fillRow() {
    List<Cell> row = new ArrayList<>();
    for (int i = 0; i < numberOfRows; i++) {
      row.add(createCell());
    }
    return row;
  }

  private Cell createCell() {
     if (Math.random() < 0.5) {
         return new LivingCell();
     } else {
         return new NotLivingCell();
     }
  }
}
