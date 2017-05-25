package com.pelensky.gameoflife;

import java.util.ArrayList;
import java.util.List;

class Life {

  private List<List<Cell>> grid;
  private int generationCount = 1;

  Life(List<List<Cell>> grid) {
    this.grid = grid;
  }

  List<List<Cell>> getGrid() {
    return grid;
  }

  private void setGrid(List<List<Cell>> grid) {
    this.grid = grid;
  }

  List<List<Integer>> countLiveNeighboursInGrid() {
    List<List<Integer>> liveNeighboursInGrid = new ArrayList<>();
    for (int row = 0; row < getGrid().size(); row++) {
      List<Integer> liveNeighboursInRow = new ArrayList<>();
      for (int column = 0; column < getGrid().get(row).size(); column++) {
        liveNeighboursInRow.add(countLiveNeighboursOfCell(row, column));
      }
      liveNeighboursInGrid.add(liveNeighboursInRow);
    }
    return liveNeighboursInGrid;
  }

  private Integer countLiveNeighboursOfCell(int row, int column) {
    Integer liveNeighbourCount = 0;
    boolean checkBelowLeft = checkLifeStatus(row - 1, column - 1);
    boolean checkBelow = checkLifeStatus(row - 1, column);
    boolean checkBelowRight = checkLifeStatus(row - 1, column + 1);
    boolean checkLeft = checkLifeStatus(row, column - 1);
    boolean checkRight = checkLifeStatus(row, column + 1);
    boolean checkAboveLeft = checkLifeStatus(row + 1, column - 1);
    boolean checkAbove = checkLifeStatus(row + 1, column);
    boolean checkAboveRight = checkLifeStatus(row + 1, column + 1);
    if (checkBelowLeft) liveNeighbourCount += 1;
    if (checkBelow) liveNeighbourCount += 1;
    if (checkBelowRight) liveNeighbourCount += 1;
    if (checkLeft) liveNeighbourCount += 1;
    if (checkRight) liveNeighbourCount += 1;
    if (checkAboveLeft) liveNeighbourCount += 1;
    if (checkAbove) liveNeighbourCount += 1;
    if (checkAboveRight) liveNeighbourCount += 1;
    return liveNeighbourCount;
  }

  private boolean checkLifeStatus(int row, int cell) {
    return !outsideOfGrid(row, cell) && getGrid().get(row).get(cell).isAlive();
  }

  private boolean outsideOfGrid(int row, int cell) {
    return row < 0 || cell < 0 || row >= getGrid().size() || cell >= getGrid().size();
  }

  void nextGeneration() {
    setNextGeneration();
    increaseGenerationCount();
  }

  private void setNextGeneration() {
    List<List<Cell>> cellGrid = new ArrayList<>();
    for (int row = 0; row < getGrid().size(); row++) {
      List<Cell> cellRow = new ArrayList<>();
      for (int column = 0; column < getGrid().get(row).size(); column++) {
        int liveNeighbours = countLiveNeighboursOfCell(row, column);
        cellRow.add(getGrid().get(row).get(column).nextGeneration(liveNeighbours));
      }
      cellGrid.add(cellRow);
    }
    setGrid(cellGrid);
  }

  int getGenerationCount() {
    return generationCount;
  }

  private void increaseGenerationCount() {
    generationCount += 1;
  }
}
