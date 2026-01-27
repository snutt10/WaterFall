package csc180.waterfallgame.Models;

import java.util.ArrayList;
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
        cars = new ArrayList<>();
        setDistance(distance);
    }

    public void resetCarState() {
        //TODO: implement logic
        cars = new ArrayList<>();
        setDistance(MIN_DISTANCE);

    }

    public boolean isOver() {
        if(getDistance() == 20){
            resetCarState();
            return true;
        }
        //TODO: implement logic
        return false;
    }
}
