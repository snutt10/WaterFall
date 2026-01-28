package csc130.racinggamewaterfall.Models;

public enum SpeedState {
    NORMAL(1.0),
    BOOST(1.5),
    SLOW(0.5),
    STOP(0);

    private final double multiplier;

    SpeedState(double multiplier) {
        this.multiplier = multiplier;
    }

    public double getMultiplier() {
        return multiplier;
    }
}
