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
        print.generationNumber(life);
        print.grid(life);
}

}
