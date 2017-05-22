package com.pelensky.gameoflife;


import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class LifeTest {

    private Life life;
    private List<List<Cell>> grid;

    @Before
    public void setUp(){
        FakeGrid fakeGrid = new FakeGrid();
        grid = fakeGrid.fakeGrid();
        life = new Life(grid);
    }

    @Test
    public void lifeTakesAGrid(){
       for (int row = 0; row < grid.size(); row ++){
           for (int cell = 0; cell < grid.get(0).size(); cell++){
               assertEquals(grid.get(row).get(cell).isAlive(), life.getGrid().get(row).get(cell).isAlive());
           }
       }
    }

    @Test
    public void countLiveNeighbours(){

    }
}
