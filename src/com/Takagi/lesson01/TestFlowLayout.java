package com.Takagi.lesson01;

import java.awt.*;

public class TestFlowLayout {
    public static void main(String[] args) {
        Frame frame = new Frame();

        //組件->按鈕
        Button button1 = new Button("button1");
        Button button2 = new Button("button2");
        Button button3 = new Button("button3");

        //設置為流式布局
        //frame.setLayout(new FlowLayout());  //默認為居中
        frame.setLayout(new FlowLayout(FlowLayout.LEFT));

        frame.setSize(200,200);

        //把按鈕添加上去
        frame.add(button1);
        frame.add(button2);
        frame.add(button3);

        frame.setVisible(true);


    }
}
