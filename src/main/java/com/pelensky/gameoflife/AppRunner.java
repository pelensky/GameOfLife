package com.pelensky.gameoflife;

class AppRunner {

  private Print print;
  private Life life;
  private Input input;

  AppRunner(Print print, Input input, Life life) {
    this.print = print;
    this.input = input;
    this.life = life;
  }

  void run() {
    print.welcome();
    newGeneration();
    while (!gameOver()) {
      newGeneration();

    }
  }

  private void newGeneration() {
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
    String selection = input.getInput().toLowerCase();
    return selection.equals("n");
  }
}
