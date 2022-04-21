package com.Takagi.lesson02;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TestActionEvent2 {
    public static void main(String[] args) {
        //兩個按鈕，實現同一個監聽
        //開始  停止
        Frame frame = new Frame("開始-停止");
        Button button1 = new Button("start");
        Button button2 = new Button("stop");

        //可以顯示的定義觸發會返回的命令，如果不顯示定義則會走默認值，默認為Button(參數)的參數名
        //可以多個按鈕只寫一個監聽類
        button2.setActionCommand("button2-stop");

        MyMonitor myMonitor = new MyMonitor();
        button1.addActionListener(myMonitor);
        button2.addActionListener(myMonitor);

        frame.add(button1,BorderLayout.NORTH);
        frame.add(button2,BorderLayout.SOUTH);

        frame.pack();
        frame.setVisible(true);

        windowClose(frame);
    }
    private static void windowClose(Frame frame){
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}

class MyMonitor implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        // e.getActionCommand()  獲得按鈕的信息
        System.out.println("按鈕被點擊了: msg=> "+e.getActionCommand());

        if(e.getActionCommand().equals("start")){

        }
    }
}
