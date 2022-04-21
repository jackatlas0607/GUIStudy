package com.Takagi.lesson06;

import javax.swing.*;
import java.awt.*;

public class TestTextDemo01 extends JFrame {
    public TestTextDemo01(){
        Container container = this.getContentPane();

       //文本框
        JTextField textField = new JTextField("Takagi");
        JTextField textField2 = new JTextField("Kurumi",20);

        container.add(textField,BorderLayout.NORTH);
        container.add(textField2,BorderLayout.SOUTH);





        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setSize(500,300);
        this.setVisible(true);
    }


    public static void main(String[] args) {
        new TestTextDemo01();
    }
}
