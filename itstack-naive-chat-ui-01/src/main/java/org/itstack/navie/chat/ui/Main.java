package org.itstack.navie.chat.ui;

import javafx.application.Application;
import javafx.stage.Stage;
import org.itstack.navie.chat.ui.view.Login;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Login login = new Login();
        login.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
