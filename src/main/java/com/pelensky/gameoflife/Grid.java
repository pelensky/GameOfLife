package com.pelensky.gameoflife;

import java.util.ArrayList;
import java.util.List;

class Grid implements GridInterface {

  private final int numberOfRows;
  private final List<List<Cell>> cellGrid;

  Grid(int numberOfRows) {
    this.numberOfRows = numberOfRows;
    this.cellGrid = fillGrid();
  }

  @Override
  public List<List<Cell>> getCellGrid() {
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
      row.add(new Cell(setInitialState()));
    }
    return row;
  }

  private boolean setInitialState() {
    return Math.random() < 0.5;
  }
}
