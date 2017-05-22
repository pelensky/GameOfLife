package com.pelensky.gameoflife;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static org.junit.Assert.assertTrue;

public class CellTest {
  private Cell cell;

  @Before
  public void setUp() {
    cell = new Cell(false);
  }

  @Test
  public void getLivingStatus() {
    assertFalse(cell.isAlive());
  }

  @Test
  public void notLivingCellsStatusCanBeChanged() {
    cell.setAlive(true);
    assertTrue(cell.isAlive());
  }

  @Test
  public void livingCellsStatusCanBeChanged() {
    cell.setAlive(true);
    cell.setAlive(false);
    assertFalse(cell.isAlive());
  }
}
