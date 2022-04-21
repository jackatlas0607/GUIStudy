package com.Takagi.lesson01;

import java.awt.*;

public class TestFrame2 {
    public static void main(String[] args) {
        //展示多個窗口 new
        MyFrame myFrame1 = new MyFrame(100,100,200,200,Color.BLUE);
        MyFrame myFrame2 = new MyFrame(300,100,200,200,Color.yellow);
        MyFrame myFrame3 = new MyFrame(100,300,200,200,Color.BLACK);
        MyFrame myFrame4 = new MyFrame(300,300,200,200,Color.white);
    }
}

class MyFrame extends Frame{
    static int id = 0;  //可能存在多個窗口，需要一個計數器

    public MyFrame(int x ,int y ,int w ,int h,Color color){
        super("MyFrame+"+(++id));  //調用父類的構造方法

        super.setVisible(true);   //調用父類設置窗口方法  super可以省略
        setBackground(color);
        setBounds(x,y,w,h);

    }
}
