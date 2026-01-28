package csc180.waterfallgame.Controllers;

import csc180.waterfallgame.Models.Car;
import csc180.waterfallgame.Models.Race;
import csc180.waterfallgame.Views.UI;

public class Raceway {
    private Race race;
    private UI view;
    private Car cars;
    private float Race_Duration;
    private String leaderBoard;

    public Raceway(Race race, float Race_Duration, String leaderBoard) {
        this.race = race;
        this.Race_Duration = Race_Duration;
        this.leaderBoard = leaderBoard;
    }

<<<<<<< HEAD
<<<<<<< HEAD
    public void race(int distance){
=======
    public void race(){
>>>>>>> parent of 4fe3966 (additions to enums and adding logic to methods)
=======
    public void race(){
>>>>>>> parent of 4fe3966 (additions to enums and adding logic to methods)
        view.showRacers(race.getCars(), race.getDistance(), Race_Duration);
        Race_Duration++;
        cars.carMovement(cars.getTraveledDistance());
        race.isOver();
    }
}
