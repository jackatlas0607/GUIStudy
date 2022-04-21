package com.Takagi.lesson02;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TestActionEvent {
    public static void main(String[] args) {
        //按下按鈕觸發一些事件
        Frame frame = new Frame();

        Button button = new Button();

        /*
        因為addActionListener()需要一個ActionListener的對象，但ActionListener為接口
        所以必須創一個類實施ActionListener接口，即成為ActionListener接口的實現類
         */
        MyActionListener myActionListener = new MyActionListener();
        button.addActionListener(myActionListener);

        frame.setBounds(300,300,300,200);

        frame.add(button,BorderLayout.CENTER);
        //frame.pack(); //自適應

        windowClose(frame);
        frame.setVisible(true);


    }

    //關閉視窗方法
    private static void windowClose(Frame frame){
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}

//事件監聽
class MyActionListener implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("aaaaaaaaaaaaaaaaaaaaaa");
    }
}
