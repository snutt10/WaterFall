package csc180.waterfallgame;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.PerspectiveCamera;
import javafx.scene.Scene;
import javafx.scene.shape.Box;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    PerspectiveCamera cam = new PerspectiveCamera();
    Box box = new Box();

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        scene.setCamera(cam);

        stage.show();
    }

    public void create3Dshape(){
        box.setHeight(100);
        box.setWidth(60);
        box.setDepth(80);
    }

    public static void main(String[] args) {
        launch();
    }
}