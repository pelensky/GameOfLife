package com.pelensky.gameoflife;

class AppRunner {

  private final Print print;
  private final Life life;
  private final Input input;
  private final Delay delayOneSecond;

  AppRunner(Print print, Input input, Life life, Delay delayOneSecond) {
    this.print = print;
    this.input = input;
    this.life = life;
    this.delayOneSecond = delayOneSecond;
  }

  void run() {
    print.welcome();
    evolve();
    while (!gameOver()) {
      evolve();
    }
    print.exit();
  }

  private void evolve() {
    int numberOfGenerations = 20;
    for (int i = 0; i < numberOfGenerations; i++) {
      print.clearScreen();
      print.generationNumber(life);
      print.grid(life);
      delayOneSecond.slowDown();
      life.nextGeneration();
    }
    print.seeNextGeneration();
  }

  private boolean gameOver() {
    return input.getInput().toLowerCase().equals("n");
  }
}
