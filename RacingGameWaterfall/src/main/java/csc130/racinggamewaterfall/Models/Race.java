package csc130.racinggamewaterfall.Models;

import java.util.List;

public class Race {
    private List<Car> cars;
    private List<Integer> scores;
    private double finishDistance;

    public Race(List<Car> cars, List<Integer> scores, double finishDistance) {
        this.cars = cars;
        this.finishDistance = finishDistance;
        this.scores = scores;
    }

    public List<Car> getCars() { return cars; }

    public List<Integer> getScores() {
        return scores;
    }

    public void setScores(List<Integer> scores) {
        this.scores = scores;
    }

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
