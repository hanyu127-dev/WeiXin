package org.itstack.naive.chat.ui.view;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Cursor;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

/**
 * 博  客：http://bugstack.cn
 * 公众号：bugstack虫洞栈 | 沉淀、分享、成长，让自己和他人都能有所收获！
 * create by 小傅哥 on @2020
 */
public class Login extends Stage  {
    private static final String RESOURCE_NAME = "/login.fxml";
    private Parent root;

    public Login() {
        try {
            root = FXMLLoader.load(getClass().getResource(RESOURCE_NAME));
        } catch (IOException e) {
            e.printStackTrace();
        }
        Scene scene = new Scene(root);
        // 填充白色
        scene.setFill(Color.TRANSPARENT);
        setScene(scene);
        initStyle(StageStyle.UNDECORATED);
        this.getIcons().add(new Image("/fxml/login/img/system/logo.png"));

        // 初始化事件
        initEvent();
    }
    private Double offsetX;
    private Double offsetY;

    public <T> T $(String id, Class<T> clazz) {
        return (T) root.lookup("#" + id);
    }

    // 面版移动
    public void move(){
        root.setOnMousePressed(event->{
            offsetX = getX()-event.getScreenX();
            offsetY = getY()-event.getScreenY();
            root.setCursor(Cursor.CLOSED_HAND);
        });

        root.setOnMouseDragged(event -> {
            setX(event.getScreenX() + offsetX);
            setY(event.getScreenY() + offsetY);
        });

        root.setOnMouseReleased(event -> {
            root.setCursor(Cursor.DEFAULT);
        });
    }
    public void min(){
        Button button = $("minButton", Button.class);
        button.setOnAction(event -> {
            setIconified(true);
        });
    }
    public void exit(){
        Button button = $("exitButton",Button.class);
        button.setOnAction(event -> {
            close();
            System.exit(0);
        });
    }

    public void login(){
        Button button = $("loginButton", Button.class);
        TextField userId = $("userId", TextField.class);
        PasswordField userPassword = $("userPassword", PasswordField.class);
        Label loginMessage = $("loginMessage",Label.class);
        button.setOnAction(event -> {
           if (userId.getText().isEmpty()==false&&userPassword.getText().isEmpty()==false){
               String username = userId.getText();
               String password = userPassword.getText();
               if (username.equals("lisi")&&password.equals("1234")){
                   loginMessage.setText("登陆成功");
               }else {
                   loginMessage.setText("用户名或密码错误");
               }
           }else {
               if (userId.getText().isEmpty()){
                   loginMessage.setText("请输入用户名");
               }else {
                   loginMessage.setText("请输入密码");
               }

           }
        });
    }

    private void initEvent(){
        move();
        min();
        exit();
        login();
    }

}
