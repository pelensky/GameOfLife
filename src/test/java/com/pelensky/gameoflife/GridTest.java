package com.pelensky.gameoflife;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GridTest {

    private Grid grid;

    @Before
    public void setUp(){
        grid = new Grid(10);
    }

    @Test
    public void setUpGrid() {
        assertEquals(10, grid.getCells().get(0).size());
    }

}
