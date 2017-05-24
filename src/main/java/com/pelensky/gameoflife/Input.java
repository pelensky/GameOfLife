package com.pelensky.gameoflife;

import java.util.Scanner;

class Input {
  private final Scanner input;

  Input(Scanner input) {
    this.input = input;
  }

  String getInput() {
    return input.nextLine();
  }
}
