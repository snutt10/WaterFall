module csc180.waterfallgame {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;

    opens csc180.waterfallgame to javafx.fxml;
    exports csc180.waterfallgame;
}