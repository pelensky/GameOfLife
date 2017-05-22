package com.pelensky.gameoflife;


import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

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
