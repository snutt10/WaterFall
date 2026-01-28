module csc.racinggamewaterfall {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires com.almasb.fxgl.all;

    opens csc130.racinggamewaterfall to javafx.fxml;
    exports csc130.racinggamewaterfall;
    exports csc130.racinggamewaterfall.Controllers;
    opens csc130.racinggamewaterfall.Controllers to javafx.fxml;
}