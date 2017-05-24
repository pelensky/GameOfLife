package com.pelensky.gameoflife;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static junit.framework.Assert.assertFalse;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

public class LifeTest {

    private Life life;
    private final List<List<Cell>> grid = new FakeGrid().createFakeGrid();

    @Before
    public void setUp(){
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
    public void countGeneration() {
        assertThat(1, is(life.getGenerationCount()));
    }

    @Test
    public void generationCountIncreases() {
        life.nextGeneration();
        assertThat(2, is(life.getGenerationCount()));
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
