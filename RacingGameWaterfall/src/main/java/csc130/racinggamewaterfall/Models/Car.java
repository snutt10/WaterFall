package csc130.racinggamewaterfall.Models;

import java.util.Random;

public class Car {
    private String name;
    private double speed;
    private double traveledDistance;
    private SpeedState speedState;
    private Random random = new Random();

    public Car(String name, double speed) {
        this.name = name;
        this.speed = speed;
        this.traveledDistance = 0;
        this.speedState = SpeedState.NORMAL;
    }

    public String getName() { return name; }
    public double getTraveledDistance() { return traveledDistance; }

    public void updateSpeedState() {
        int roll = random.nextInt(100);

        if (roll < 10) speedState = SpeedState.STOP;
        else if (roll < 30) speedState = SpeedState.SLOW;
        else if (roll < 60) speedState = SpeedState.NORMAL;
        else speedState = SpeedState.BOOST;
    }

    public void move() {
        updateSpeedState();
        traveledDistance += speed * speedState.getMultiplier();
    }

    public void reset() {
        traveledDistance = 0;
        speedState = SpeedState.NORMAL;
    }
}
