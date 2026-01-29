package csc130.racinggamewaterfall.Controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class LoginController {

    @FXML private TextField usernameField;
    @FXML private PasswordField passwordField;
    @FXML private Label messageLabel;

    @FXML
    private void handleLogin(ActionEvent event) {
        String user = usernameField.getText();
        String pass = passwordField.getText();

        // Simple fake login check
        if (user.equals("player") && pass.equals("1234")) {
            loadGameScreen(event);
        } else {
            messageLabel.setText("Invalid login. Try player / 1234");
        }
    }

    private void loadGameScreen(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/csc130/racinggamewaterfall/hello-view.fxml"));
            Scene gameScene = new Scene(loader.load(), 700, 700);

            Stage stage = (Stage) usernameField.getScene().getWindow();
            stage.setScene(gameScene);
            stage.setTitle("Race Car Game");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
