module csc180.waterfallgame {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires java.desktop;

    opens csc180.waterfallgame to javafx.fxml;
    exports csc180.waterfallgame;
    exports csc180.waterfallgame.Controllers;
    opens csc180.waterfallgame.Controllers to javafx.fxml;
}