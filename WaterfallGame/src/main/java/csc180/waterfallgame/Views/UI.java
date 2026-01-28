package csc180.waterfallgame.Views;

import csc180.waterfallgame.Models.Car;
import csc180.waterfallgame.Models.Race;

import java.util.ArrayList;
import java.util.List;

public class UI {
    List<Car> cars = new ArrayList<>();
    Race race = new Race(cars, 15);

    private void cars (List<Car> cars) {
        //Todo: implement logic
    }

    private void locationOfRacer(Car car){
        //TODO: implement logic
    }

    private void displayLeaderBoard(){
        if(race.isOver(15)){
            //TODO: Add a point to the winners score on the leaderboard
        }
    }
}
