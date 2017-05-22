package com.pelensky.gameoflife;



import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.Assert.assertFalse;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

public class LifeTest {

    private Life life;
    private List<List<Cell>> grid;
    private final Cell x0y0 = new NotLivingCell();

    private void createFakeGrid() {
        grid = new ArrayList<>();
        grid.add(row0());
        grid.add(row1());
        grid.add(row2());
        grid.add(row3());
        grid.add(row4());
    }

    private List<Cell> row0() {
        List<Cell> row = new ArrayList<>();
        row.add(x0y0);
        row.add(new LivingCell());
        row.add(new NotLivingCell());
        row.add(new NotLivingCell());
        row.add(new NotLivingCell());
        return row;
    }

    private List<Cell> row1() {
        List<Cell> row = new ArrayList<>();
        row.add(new NotLivingCell());
        row.add(new NotLivingCell());
        row.add(new NotLivingCell());
        row.add(new NotLivingCell());
        row.add(new NotLivingCell());
        return row;
    }

    private List<Cell> row2() {
        List<Cell> row = new ArrayList<>();
        row.add(new NotLivingCell());
        row.add(new LivingCell());
        row.add(new NotLivingCell());
        row.add(new LivingCell());
        row.add(new NotLivingCell());
        return row;
    }

    private List<Cell> row3() {
        List<Cell> row = new ArrayList<>();
        row.add(new NotLivingCell());
        row.add(new LivingCell());
        row.add(new LivingCell());
        row.add(new LivingCell());
        row.add(new NotLivingCell());
        return row;
    }

    private List<Cell> row4() {
        List<Cell> row = new ArrayList<>();
        row.add(new NotLivingCell());
        row.add(new NotLivingCell());
        row.add(new NotLivingCell());
        row.add(new LivingCell());
        row.add(new NotLivingCell());
        return row;
    }

    @Before
    public void setUp(){
        createFakeGrid();
        life = new Life(grid);
    }

    @Test
    public void lifeTakesAGrid(){
      assertFalse(life.getGrid().get(0).get(0).isAlive());
    }

    @Test
    public void countsLiveNeighbours() {
        assertThat(1, is(equalTo(life.countLiveNeighbours().get(0).get(0))));
    }

    @Test
    public void nextGeneration() {
        life.nextGeneration();
        assertFalse(life.getGrid().get(0).get(0).isAlive());
        assertFalse(life.getGrid().get(0).get(1).isAlive());
        assertFalse(life.getGrid().get(0).get(2).isAlive());
        assertFalse(life.getGrid().get(0).get(3).isAlive());
        assertFalse(life.getGrid().get(0).get(4).isAlive());

        assertFalse(life.getGrid().get(1).get(0).isAlive());
        assertFalse(life.getGrid().get(1).get(1).isAlive());
        assertTrue(life.getGrid().get(1).get(2).isAlive());
        assertFalse(life.getGrid().get(1).get(3).isAlive());
        assertFalse(life.getGrid().get(1).get(4).isAlive());

        assertFalse(life.getGrid().get(2).get(0).isAlive());
        assertTrue(life.getGrid().get(2).get(1).isAlive());
        assertFalse(life.getGrid().get(2).get(2).isAlive());
        assertTrue(life.getGrid().get(2).get(3).isAlive());
        assertFalse(life.getGrid().get(2).get(4).isAlive());

        assertFalse(life.getGrid().get(3).get(0).isAlive());
        assertTrue(life.getGrid().get(3).get(1).isAlive());
        assertFalse(life.getGrid().get(3).get(2).isAlive());
        assertTrue(life.getGrid().get(3).get(3).isAlive());
        assertTrue(life.getGrid().get(3).get(4).isAlive());

        assertFalse(life.getGrid().get(4).get(0).isAlive());
        assertFalse(life.getGrid().get(4).get(1).isAlive());
        assertFalse(life.getGrid().get(4).get(2).isAlive());
        assertTrue(life.getGrid().get(4).get(3).isAlive());
        assertFalse(life.getGrid().get(4).get(4).isAlive());
    }

}
