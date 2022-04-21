package com.Takagi.lesson03;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.Iterator;

//測試鼠標監聽事件
public class TestMouseListener {
    public static void main(String[] args) {
        new MyFrame("畫圖");

    }
}

class MyFrame extends Frame {
    //畫畫需要畫筆，需要監聽鼠標當前位置，需要集合來儲存這個點
    ArrayList points;

    public MyFrame(String title) {
        super(title);
        setBounds(200, 200, 400, 300);

        //存鼠標點擊的點
        points = new ArrayList<>();

        setVisible(true);

        //鼠標監聽器，正對這個窗口
        this.addMouseListener(new MyMouseListener());

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    @Override
    public void paint(Graphics g) {
        //畫畫，需要監聽鼠標的事件
        Iterator iterator = points.iterator();
        while (iterator.hasNext()) {
            Point point = (Point) iterator.next();
            g.setColor(Color.BLUE);
            g.fillOval(point.x, point.y, 10, 10);
        }
    }

    //添加一個點到介面上
    public void addPaint(Point point) {
        points.add(point);
    }


   /*
    若使用 private class MyMouseListener implements MouseListener
    則必須重寫所有MouseListener接口的方法
    */

    //適配器模式
    private class MyMouseListener extends MouseAdapter {
        //鼠標  按下，彈起，按住不放

        @Override
        public void mousePressed(MouseEvent e) {
            MyFrame frame = (MyFrame) e.getSource();    //e.getSource()  返回當前對象
            //這個我們點擊的時候，就會在介面上產生一個點
            //這個點就是鼠標的點
            frame.addPaint(new Point(e.getX(), e.getY()));

            //每次點擊鼠標都需要重新畫一遍
            frame.repaint();  //刷新   30fps 60fps
        }
    }
}
