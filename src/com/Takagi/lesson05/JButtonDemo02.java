package com.Takagi.lesson05;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class JButtonDemo02 extends JFrame {
    public JButtonDemo02(){
        Container container = this.getContentPane();

        //將一個圖片變為圖標
        URL resource = JButtonDemo01.class.getResource("Sasuke.jpg");
        Icon icon = new ImageIcon(resource);

        //單選框
        JRadioButton radioButton1 = new JRadioButton("JRadioButton01");
        JRadioButton radioButton2 = new JRadioButton("JRadioButton02");
        JRadioButton radioButton3 = new JRadioButton("JRadioButton03");

        //由於單選框只能選擇一個，分組，一個組中只能選擇一個
        ButtonGroup group = new ButtonGroup();
        group.add(radioButton1);
        group.add(radioButton2);
        group.add(radioButton3);

        container.add(radioButton1,BorderLayout.NORTH);
        container.add(radioButton2,BorderLayout.CENTER);
        container.add(radioButton3,BorderLayout.SOUTH);


        this.setVisible(true);
        this.setSize(500,300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new JButtonDemo02();
    }
}
