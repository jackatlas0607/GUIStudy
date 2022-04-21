package com.Takagi.lesson01;

import java.awt.*;

//GUI的第一個介面
public class TestFrame {
    //Frame  視窗，窗口
    public static void main(String[] args) {
        //Frame對象
        Frame frame=new Frame("我的第一個java圖形介面窗口");

        //需要設置可見性  w  h  寬高
        frame.setVisible(true);

        //設置窗口大小
        frame.setSize(400,400);

        //設置背景顏色  Color
        //也可透過Color靜態方法獲得Color定義的顏色 ex:frame.setBackground(Color.BLACK);
        frame.setBackground(new Color(1,1,1));

        //彈出的初始位置
        frame.setLocation(200,200);

        //設置視窗大小固定
        frame.setResizable(false);  //默認為true,即可以改變視窗大小

        /*
        做完以上的設置關掉窗口只能用結束程序的方式
         */
    }

}
