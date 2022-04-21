package com.Takagi.lesson01;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

//練習
public class ExDemo {
    public static void main(String[] args) {

        //總Frame
        Frame frame = new Frame();

        frame.setSize(400, 300);
        frame.setLocation(300, 300);
        frame.setBackground(Color.BLACK);
        frame.setVisible(true);

        //把frame拆成上下兩塊(rows:2,cols:1)
        frame.setLayout(new GridLayout(2, 1));

        //4個面板

        Panel p1 = new Panel(new BorderLayout());

        //Panel p2 = new Panel(new GridLayout(2, 1));等於下面兩行
        Panel p2 = new Panel();
        p2.setLayout(new GridLayout(2,1));

        Panel p3 = new Panel(new BorderLayout());
        Panel p4 = new Panel(new GridLayout(2, 2));

        //上面ok
        p1.add(new Button("east-1"), BorderLayout.EAST);
        p1.add(new Button("west-1"), BorderLayout.WEST);
        p2.add(new Button("p2-btn-2"));
        p2.add(new Button("p2-btn-1"));
        p1.add(p2, BorderLayout.CENTER);


        //下面
        p3.add(new Button("east-2"), BorderLayout.EAST);
        p3.add(new Button("west-2"), BorderLayout.WEST);
        //下面中間4個
        for (int i = 1; i <= 4; i++) {
            p4.add(new Button("for-" + i));
        }

        p3.add(p4, BorderLayout.CENTER);

        //p2已放到p1，p3已放到p4

        frame.add(p3);
        frame.add(p1);

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });


    }
}
