package com.pelensky.gameoflife;

import java.util.ArrayList;
import java.util.List;

class Grid {

  private final int numberOfRows;
  private final List<List<Cell>> cellGrid;

  Grid(int numberOfRows) {
    this.numberOfRows = numberOfRows;
    this.cellGrid = makeGrid();
  }

  List<List<Cell>> getCellGrid() {
    return cellGrid;
  }

  private List<List<Cell>> makeGrid() {
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
    final double proportionOfLiveCells = 0.5;
    if (Math.random() < proportionOfLiveCells) {
      return new LivingCell();
    } else {
      return new NotLivingCell();
    }
  }
}
