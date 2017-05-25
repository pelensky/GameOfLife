package com.pelensky.gameoflife;

import java.io.PrintStream;
import java.util.Scanner;

public class GameOfLife {

  public static void main(String[] args) {
    AppRunner appRunner =
        new AppRunner(
            new Print(new PrintStream(System.out)),
            new Input(new Scanner(System.in)),
            new Life(new Grid(10).getCellGrid()),
            new DelayOneSecond());
    appRunner.run();
  }
}
