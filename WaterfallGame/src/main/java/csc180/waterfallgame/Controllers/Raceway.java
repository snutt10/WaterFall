package csc180.waterfallgame.Controllers;

import csc180.waterfallgame.Models.Race;

public class Raceway {
    private Race race;
    private float Race_Duration;
    private String leaderBoard;

    public Raceway(Race race, float Race_Duration, String leaderBoard) {
        this.race = race;
        this.Race_Duration = Race_Duration;
        this.leaderBoard = leaderBoard;
    }

    public void race(){
        //TODO: Implement logic
    }

    private void moveCars(){
        //TODO: implement logic
    }
}
