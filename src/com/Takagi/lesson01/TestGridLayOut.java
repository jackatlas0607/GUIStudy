package com.Takagi.lesson01;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TestGridLayOut {
    public static void main(String[] args) {
        Frame frame = new Frame("TestGridLayOut");

        Button bt1 = new Button("bt1");
        Button bt2 = new Button("bt2");
        Button bt3 = new Button("bt3");
        Button bt4 = new Button("bt4");
        Button bt5 = new Button("bt5");
        Button bt6 = new Button("bt6");

        frame.setLayout(new GridLayout(3,2));

        frame.add(bt1);
        frame.add(bt2);
        frame.add(bt3);
        frame.add(bt4);
        frame.add(bt5);
        frame.add(bt6);

        frame.pack(); //這個方法會將目前的布局以最優秀的位置來確定，但是不寫也不影響程序
        frame.setVisible(true);

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}
