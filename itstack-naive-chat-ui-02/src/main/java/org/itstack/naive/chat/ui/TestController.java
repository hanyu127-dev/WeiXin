package org.itstack.naive.chat.ui;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.awt.*;

public class TestController {
    @FXML
    private Button myBtn;
    @FXML
    protected void onHelloButtonClick() {
        System.out.println("按钮被点击了");
        myBtn.setPrefWidth(150);
    }

    public void initialize(){
        System.out.println("组件初始化结束，可以进行初始化数据");
    }



}
