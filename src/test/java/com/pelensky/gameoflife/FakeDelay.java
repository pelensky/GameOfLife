package com.pelensky.gameoflife;

public class FakeDelay implements Delay {

    boolean isWasCalled() {
        return wasCalled;
    }
    private boolean wasCalled = false;

    @Override
    public void slowDown() {
    wasCalled = true;
    }
}
