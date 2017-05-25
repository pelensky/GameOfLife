package com.pelensky.gameoflife;

class DelayOneSecond implements Delay {
  @Override
  public void slowDown() {
    try {
      Thread.sleep(1000);
    } catch (InterruptedException e) {
    }
  }
}
