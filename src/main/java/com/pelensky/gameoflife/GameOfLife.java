package com.pelensky.gameoflife;

import java.io.PrintStream;
import java.util.List;

public class GameOfLife {

    public static void main(String[] args) {
        PrintStream output = new PrintStream(System.out);
        Print print = new Print(output);
        List<List<Cell>> grid = new FakeGrid().createFakeGrid();
        Life life = new Life(grid);
        AppRunner appRunner = new AppRunner(print, life);
        appRunner.run();
    }
}
