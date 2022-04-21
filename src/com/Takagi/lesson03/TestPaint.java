package com.Takagi.lesson03;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TestPaint {
    public static void main(String[] args) {
        new MyPaint().loadFrame();
    }
}

class MyPaint extends Frame {

    public void loadFrame() {
        setBounds(200, 200, 600, 500);
        setVisible(true);


        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }


    //畫筆
    @Override
    public void paint(Graphics g) {
        //畫筆需要有顏色，畫筆可以畫畫
        g.setColor(Color.red);
        //g.drawOval(100,100,100,100);  //空心的圓
        g.fillOval(100,100,100,100);  //實心的圓

        g.setColor(Color.GREEN);
        g.fillRect(150,200,200,200);

        //養成習慣，畫筆用完，將他還原到最初的顏色

    }
}
