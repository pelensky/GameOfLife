package com.pelensky.gameoflife;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.List;
import java.util.Scanner;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertThat;

public class AppRunnerTest {
  private ByteArrayOutputStream out;
  private AppRunner appRunner;


  private void run(String text) {
    out = new ByteArrayOutputStream();
    PrintStream output = new PrintStream(out);
    Print print = new Print(output);
    List<List<Cell>> grid = new FakeGrid().createFakeGrid();
    final Life life = new Life(grid);
    Scanner scanner = new Scanner(text);
    Input input = new Input(scanner);
    appRunner = new AppRunner(print, input, life);
  }

  @Test
  public void welcomesUser() {
    run("n\n");
    appRunner.run();
    assertThat(out.toString(), containsString("Game of Life"));
  }

  @Test
  public void printGenerationNumber() {
    run("n\n");
    appRunner.run();
    assertThat(out.toString(), containsString("Generation 1"));
  }

  @Test
  public void printGenerationOne() {
    run("n\nn\n");
    appRunner.run();
    assertThat(
        out.toString(),
        containsString(
            ".*..."
                + System.lineSeparator()
                + "....."
                + System.lineSeparator()
                + ".*.*."
                + System.lineSeparator()
                + ".***."
                + System.lineSeparator()
                + "...*."));
  }

  @Test
    public void printGeneration2() {
    run("n\nn\n");
    appRunner.run();
      assertThat(out.toString(), containsString("Generation 2"));
  }

  @Test
  public void seeNextGeneration() {
    run("n\n");
    appRunner.run();
    assertThat(out.toString(), containsString("See Next Generation?" + System.lineSeparator() +  "Input `n` for No or any key for Yes"));
  }
}
