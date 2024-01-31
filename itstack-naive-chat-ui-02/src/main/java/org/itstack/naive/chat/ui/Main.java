package org.itstack.naive.chat.ui;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import org.itstack.naive.chat.ui.view.Login;

import java.util.Optional;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Login login = new Login();
        login.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}