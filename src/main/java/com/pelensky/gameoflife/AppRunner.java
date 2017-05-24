package com.pelensky.gameoflife;

class AppRunner {

  private final Print print;
  private final Life life;
  private final Input input;

  AppRunner(Print print, Input input, Life life) {
    this.print = print;
    this.input = input;
    this.life = life;
  }

  void run() {
    print.welcome();
    evolve();
    while (!gameOver()) {
      evolve();
    }
  }

  private void evolve() {
    int numberOfGenerations = 5;
    for (int i = 0; i < numberOfGenerations; i++) {
      print.generationNumber(life);
      print.grid(life);
      slowDown();
      life.nextGeneration();
    }
    print.seeNextGeneration();
  }

  private void slowDown() {
    try {
      Thread.sleep(1000);
    } catch (InterruptedException e) {
    }
  }

  private boolean gameOver() {
    return input.getInput().toLowerCase().equals("n");
  }
}
