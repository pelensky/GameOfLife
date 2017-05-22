package com.pelensky.gameoflife;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CellGridTest {

  private CellGrid cellGrid;

  @Before
  public void setUp() {
    cellGrid = new CellGrid(10);
  }

  @Test
  public void setUpGrid() {
    assertEquals(10, cellGrid.getCellGrid().get(0).size());
  }
}
