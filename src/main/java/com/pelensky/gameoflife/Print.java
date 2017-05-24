package com.pelensky.gameoflife;

import java.io.PrintStream;

class Print {

    private final PrintStream output;

    Print (PrintStream output) {
        this.output = output;
    }

    void welcome () {
        output.println("Game of Life");
    }

    void generationNumber(Life life) {
    output.println("Generation " + life.getGenerationCount());
    }

    void seeNextGeneration() {
        output.println("See Next Generation?" + System.lineSeparator() + "Input `n` for No or any key for Yes");
    }

    void grid(Life life) {
     output.println(formatGrid(life));
    }

    private String formatGrid(Life life) {
       StringBuilder grid = new StringBuilder();
        for (int row = 0; row < life.getGrid().size(); row++) {
            StringBuilder singleRow = new StringBuilder();
            for (int column = 0; column < life.getGrid().get(row).size(); column ++ ) {
                singleRow.append(life.getGrid().get(row).get(column).marker());
            }
            grid.append(singleRow).append(System.lineSeparator());
        }
        return String.valueOf(grid.toString());
    }

}
