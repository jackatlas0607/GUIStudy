package com.Takagi.lesson05;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class JButtonDemo01 extends JFrame {

    public JButtonDemo01(){
        Container container = this.getContentPane();

        //將一個圖片變為圖標
        URL resource = JButtonDemo01.class.getResource("Sasuke.jpg");
        Icon icon = new ImageIcon(resource);

        //把這個圖標放在按鈕上
        JButton button = new JButton();
        button.setIcon(icon);
        button.setToolTipText("這是一個圖片按鈕");   //鼠標放上去顯示的訊息

        //add
        container.add(button);

        this.setVisible(true);
        this.setSize(500,300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new JButtonDemo01();
    }
}
