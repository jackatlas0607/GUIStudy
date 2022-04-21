package com.Takagi.lesson06;

import javax.swing.*;
import java.awt.*;

public class TestTextDemo03 extends JFrame {
    public TestTextDemo03(){
        Container container = this.getContentPane();

        //文本域
        JTextArea textArea = new JTextArea(20, 50);
        textArea.setText("Takagi Origami Kurumi");

        //Scroll面板
        JScrollPane scrollPane = new JScrollPane(textArea);

        container.add(scrollPane);


        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setSize(500,300);
        this.setVisible(true);
    }


    public static void main(String[] args) {
        new TestTextDemo03();
    }
}
