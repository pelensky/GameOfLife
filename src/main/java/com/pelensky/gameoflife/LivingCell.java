package com.pelensky.gameoflife;

public class LivingCell implements Cell {

  @Override
  public boolean isAlive() {
    return true;
  }

  @Override
  public Cell nextGeneration(int neighbours) {
    final int overpopulation = 3;
    final int underpopulation = 2;
    if (neighbours >= underpopulation && neighbours <= overpopulation) {
      return new LivingCell();
    } else {
      return new NotLivingCell();
    }
  }

  @Override
  public String marker() {
    return "*";
  }
}
