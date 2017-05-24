package com.pelensky.gameoflife;

import java.io.PrintStream;
import java.util.List;
import java.util.Scanner;

public class GameOfLife {

    public static void main(String[] args) {
        PrintStream output = new PrintStream(System.out);
        Print print = new Print(output);
        List<List<Cell>> grid = new Grid(10).getCellGrid();
        Life life = new Life(grid);
        Input input = new Input(new Scanner(System.in));
        AppRunner appRunner = new AppRunner(print, input, life);
        appRunner.run();
    }
}
