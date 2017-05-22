package com.pelensky.gameoflife;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LifeTest {

    private Life life;
    private Grid fakeGrid;

    @Before
    public void setUp(){
        fakeGrid = new FakeGrid();
        life = new Life(fakeGrid);
    }

    @Test
    public void lifeTakesAGrid(){
       for (int row = 0; row < fakeGrid.getCellGrid().size(); row ++){
           for (int cell = 0; cell < fakeGrid.getCellGrid().get(0).size(); cell++){
               assertEquals(fakeGrid.getCellGrid().get(row).get(cell).isAlive(), life.getGrid().get(row).get(cell).isAlive());
           }
       }
    }
}
