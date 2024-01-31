package org.itstack.naive.chat.ui;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import org.itstack.naive.chat.ui.view.chat.ChatController;
import org.itstack.naive.chat.ui.view.chat.IChatMethod;
import org.itstack.naive.chat.ui.view.login.ILoginMethod;
import org.itstack.naive.chat.ui.view.login.LoginController;

public class Application extends javafx.application.Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent test = FXMLLoader.load(getClass().getResource("/fxml/chat.fxml"));
        Scene scene = new Scene(test);
        primaryStage.initStyle(StageStyle.TRANSPARENT);
        primaryStage.setScene(scene);
        primaryStage.getIcons().add(new Image("/fxml/login/img/system/logo.png"));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
