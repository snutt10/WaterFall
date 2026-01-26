package csc180.waterfallgame.Models;

import java.util.List;

public class Race {
    private int MIN_DISTANCE = 5;
    private List<Car> cars;
    private int distance;

    public Race(List<Car> cars, int distance) {}

    //region Getters/Setters
    public List<Car> getCars() {
        return cars;
    }

    private void setCars(List<Car> cars) {
        this.cars = cars;
    }

    public int getDistance() {
        return distance;
    }

    private void setDistance(int distance) {
        this.distance = distance;
    }

    public int getMIN_DISTANCE() {
        return MIN_DISTANCE;
    }

    //endregion

    public void Race(int distance) {
        //TODO: implement logic
    }

    public void resetCarState(List<Car> cars) {
        //TODO: implement logic
    }

    public boolean isOver() {
        //TODO: implement logic
        return false;
    }
}
