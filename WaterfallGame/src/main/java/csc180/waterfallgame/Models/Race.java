package csc180.waterfallgame.Models;

import java.util.ArrayList;
import java.util.List;

public class Race {
    private int MIN_DISTANCE = 5;
    private List<Car> cars;
    private int distance;
Car c = new Car();

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
        c.carMovement(distance);
    }

    public void resetCarState(List<Car> cars) {
        //TODO: implement logic
        CarState carState = CarState.NORMAL;
        for (Car car : cars) {
            carState = car.getCarState();
        }

    }

    public boolean isOver() {
        //TODO: implement logic
     for (Car car : cars) {
         if(c.getTraveledDistance() >= distance){
             //put winner
         }

     }
        return false;
    }
}
