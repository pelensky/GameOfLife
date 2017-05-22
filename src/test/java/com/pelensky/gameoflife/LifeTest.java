package com.pelensky.gameoflife;

import org.junit.Before;

import static org.junit.Assert.assertEquals;

public class LifeTest {

    private Life life;
    private Grid fakeGrid;

    @Before
    public void setUp(){
        fakeGrid = new FakeGrid();
        life = new Life(fakeGrid);
    }

    @Before
    public void lifeTakesAGrid(){
        assertEquals(fakeGrid.getCellGrid(), life.getGrid());
    }
}
