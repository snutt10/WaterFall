package csc180.waterfallgame.Controllers;

import csc180.waterfallgame.Models.Car;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    Car cars = new Car();

    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @FXML
    protected void onStartButtonClick(){
        cars.carMovement(15);
    }

}