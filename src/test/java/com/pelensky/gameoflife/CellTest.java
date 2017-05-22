package com.pelensky.gameoflife;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static org.junit.Assert.assertTrue;

public class CellTest {
  private Cell livingCell;
  private Cell notLivingCell;

  @Before
  public void setUp() {
    livingCell = new LivingCell();
    notLivingCell = new NotLivingCell();
  }

  @Test
  public void getLivingStatus() {
    assertFalse(notLivingCell.isAlive());
    assertTrue(livingCell.isAlive());
  }

}
