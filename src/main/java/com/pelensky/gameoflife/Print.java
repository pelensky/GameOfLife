package com.pelensky.gameoflife;

import java.io.PrintStream;

class Print {

    private PrintStream output;

    Print (PrintStream output) {
        this.output = output;
    }

    void welcome () {
        output.println("Game of Life");
    }

    void generation(Life life) {
    output.println("Generation " + life.getGenerationCount());
    }

}
