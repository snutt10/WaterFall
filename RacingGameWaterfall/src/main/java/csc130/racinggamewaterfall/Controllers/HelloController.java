package csc130.racinggamewaterfall.Controllers;


import csc130.racinggamewaterfall.Models.Car;
import csc130.racinggamewaterfall.Models.Race;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.util.Duration;

import java.util.ArrayList;
import java.util.List;

public class HelloController {

    @FXML private Pane trackPane;
    @FXML private Label statusLabel;

    private Race race;
    private List<Rectangle> carGraphics = new ArrayList<>();
    private Timeline timeline;

    private final double FINISH_LINE = 550;

    @FXML
    public void startRace() {
        setupRace();
        statusLabel.setText("Race in progress...");
        timeline.playFromStart();
    }

    private void setupRace() {
        trackPane.getChildren().clear();
        carGraphics.clear();

        List<Car> cars = List.of(
                new Car("Red Car", 5),
                new Car("Blue Car", 5),
                new Car("Green Car", 5),
                new Car("Yellow Car", 5)
        );

        race = new Race(cars, FINISH_LINE);

        Color[] colors = {Color.RED, Color.BLUE, Color.GREEN, Color.YELLOW};

        for (int i = 0; i < cars.size(); i++) {
            Rectangle carRect = new Rectangle(40, 20, colors[i]);
            carRect.setX(0);
            carRect.setY(50 + i * 50);
            carGraphics.add(carRect);
            trackPane.getChildren().add(carRect);
        }

        timeline = new Timeline(new KeyFrame(Duration.millis(100), e -> updateRace()));
        timeline.setCycleCount(Timeline.INDEFINITE);
    }

    private void updateRace() {
        for (int i = 0; i < race.getCars().size(); i++) {
            Car car = race.getCars().get(i);
            car.move();
            carGraphics.get(i).setX(car.getTraveledDistance());
        }

        if (race.isOver()) {
            timeline.stop();
            statusLabel.setText("🏆 Winner: " + race.getWinner().getName());
        }
    }
}
