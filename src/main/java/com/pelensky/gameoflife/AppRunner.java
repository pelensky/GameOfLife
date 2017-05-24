package com.pelensky.gameoflife;

class AppRunner {

    private Print print;
    private Life life;

AppRunner(Print print, Life life){
    this.print = print;
    this.life = life;
}

    void run() {
        print.welcome();
//        while (life.livingCells() > 0) {
            newGeneration();
            life.nextGeneration();
//        }
        newGeneration();

}

    private void newGeneration() {
        print.generationNumber(life);
        print.grid(life);
    }

}
