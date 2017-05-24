package com.pelensky.gameoflife;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.List;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertThat;

public class AppRunnerTest {
    private ByteArrayOutputStream out;
    private AppRunner appRunner;

    @Before
    public void setUp() {
        out = new ByteArrayOutputStream();
        PrintStream output = new PrintStream(out);
        Print print = new Print(output);
        List<List<Cell>> grid = new FakeGrid().createFakeGrid();
        final Life life = new Life(grid);
        appRunner = new AppRunner(print, life);
    }

    @Test
    public void welcomesUser() {
        appRunner.run();
        assertThat(
                out.toString(),
                containsString("Game of Life"));
    }

    @Test
    public void printGenerationNumber() {
        appRunner.run();
        assertThat(out.toString(), containsString("Generation 1"));
    }

    @Test
    public void printGenerationOne() {
        appRunner.run();
        assertThat(out.toString(), containsString(" *   " + System.lineSeparator() + "     " + System.lineSeparator() + " * * " + System.lineSeparator() + " *** " + System.lineSeparator() + "   * "));
    }







}
