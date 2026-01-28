package csc130.racinggamewaterfall.Models;

import java.util.List;

public class Race {
    private List<Car> cars;
    private double finishDistance;

    public Race(List<Car> cars, double finishDistance) {
        this.cars = cars;
        this.finishDistance = finishDistance;
    }

    public List<Car> getCars() { return cars; }

    public boolean isOver() {
        return cars.stream().anyMatch(c -> c.getTraveledDistance() >= finishDistance);
    }

    public Car getWinner() {
        return cars.stream()
                .filter(c -> c.getTraveledDistance() >= finishDistance)
                .findFirst()
                .orElse(null);
    }

    public void reset() {
        cars.forEach(Car::reset);
    }
}
