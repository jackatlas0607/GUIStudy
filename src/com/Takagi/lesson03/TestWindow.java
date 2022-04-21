package com.Takagi.lesson03;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TestWindow {
    public static void main(String[] args) {
          new WindowFrame();
    }
}

class WindowFrame extends Frame {
    public WindowFrame() {
        setBackground(Color.BLUE);
        setBounds(100,100,200,200);
        setVisible(true);
        //addWindowListener(new MyWindowListener());

        //匿名內部類，推薦寫法
        this.addWindowListener(new WindowAdapter() {
            //關閉視窗
            @Override
            public void windowClosing(WindowEvent e) {
                System.out.println("windowClosing");
                System.exit(0);
            }

            //打開視窗
            @Override
            public void windowActivated(WindowEvent e) {
                WindowFrame source = (WindowFrame) e.getSource();
                source.setTitle("視窗被打開了");
                System.out.println("windowActivated");
            }
        });
    }

}
