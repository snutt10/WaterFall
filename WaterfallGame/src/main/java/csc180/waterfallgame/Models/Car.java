package csc180.waterfallgame.Models;

import java.util.ArrayList;

public class Car {
    private int CAR_AMOUNT = 4;
    private String name;
    private int speed;
    private int traveledDistance;
    private CarState carState;
    private ArrayList<SpeedState> trackSpeed;

    public Car(){

    }
    public Car(String name, int speed, int traveledDistance, CarState carState) {
        this.name = name;
        this.speed = speed;
        this.traveledDistance = traveledDistance;
        this.carState = carState;
        this.trackSpeed = new ArrayList<>();
    }

    //region Getters/Setters

    public int getCAR_AMOUNT() {
        return CAR_AMOUNT;
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getTraveledDistance() {
        return traveledDistance;
    }

    private void setTraveledDistance(int traveledDistance) {
        this.traveledDistance = traveledDistance;
    }

    public CarState getCarState() {
        return carState;
    }

    private void setCarState(CarState carState) {
        this.carState = carState;
    }

    public ArrayList<SpeedState> getTrackSpeed() {
        return trackSpeed;
    }

    private void setTrackSpeed(ArrayList<SpeedState> trackSpeed) {
        this.trackSpeed = trackSpeed;
    }

    //endregion

    protected void distanceTravelled(int moveAmount) {
        //TODO: implement logic
        if (traveledDistance < 0) {
            traveledDistance = 0;
        }
        setTraveledDistance(getTraveledDistance() + moveAmount);
    }

    protected void track(SpeedState speedState){
        //TODO: implement logic
      for(SpeedState s : trackSpeed){
          if(s == speedState){
              System.out.println("Car speed is: " + speedState);
          }
      }
    }

    protected void checkCarState(){
        //TODO: implement logic
         for(CarState c : CarState.values()){
             if (c == carState){
                 System.out.println("Car state is: " + carState);
             } else {
                 System.out.println("Car state is: " + c);
             }
         }
        }


    public void carMovement(int distance){
        //TODO: implement logic

    }

}
