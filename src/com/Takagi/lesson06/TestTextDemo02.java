package com.Takagi.lesson06;

import javax.swing.*;
import java.awt.*;

public class TestTextDemo02 extends JFrame {
    public TestTextDemo02(){
        Container container = this.getContentPane();

        JPasswordField passwordField = new JPasswordField();  //*******   默認為*，也可手動設置
        passwordField.setEchoChar('*');

        container.add(passwordField);

        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setSize(500,300);
        this.setVisible(true);
    }


    public static void main(String[] args) {
        new TestTextDemo02();
    }
}
