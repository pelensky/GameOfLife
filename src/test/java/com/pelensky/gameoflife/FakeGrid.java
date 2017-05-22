package com.pelensky.gameoflife;

import java.util.ArrayList;
import java.util.List;

public class FakeGrid implements GridInterface {
  @Override
  public List<List<Cell>> getCellGrid() {
    return setUpFakeGrid();
  }

  private List<List<Cell>> setUpFakeGrid() {
    List<List<Cell>> grid = new ArrayList<>();
    grid.add(row0());
    grid.add(row1());
    grid.add(row2());
    grid.add(row3());
    grid.add(row4());
    return grid;
  }

  private List<Cell> row0() {
    List<Cell> row = new ArrayList<>();
    row.add(new Cell(false));
    row.add(new Cell(true));
    row.add(new Cell(false));
    row.add(new Cell(false));
    row.add(new Cell(false));
    return row;
  }

  private List<Cell> row1() {
    List<Cell> row = new ArrayList<>();
    row.add(new Cell(false));
    row.add(new Cell(false));
    row.add(new Cell(false));
    row.add(new Cell(false));
    row.add(new Cell(false));
    return row;
  }

  private List<Cell> row2() {
    List<Cell> row = new ArrayList<>();
    row.add(new Cell(false));
    row.add(new Cell(true));
    row.add(new Cell(false));
    row.add(new Cell(true));
    row.add(new Cell(false));
    return row;
  }

  private List<Cell> row3() {
    List<Cell> row = new ArrayList<>();
    row.add(new Cell(false));
    row.add(new Cell(true));
    row.add(new Cell(true));
    row.add(new Cell(true));
    row.add(new Cell(false));
    return row;
  }

  private List<Cell> row4() {
    List<Cell> row = new ArrayList<>();
    row.add(new Cell(false));
    row.add(new Cell(false));
    row.add(new Cell(false));
    row.add(new Cell(true));
    row.add(new Cell(false));
    return row;
  }
}
