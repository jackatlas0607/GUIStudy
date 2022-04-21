package com.Takagi.lesson04;

import javax.swing.*;
import java.awt.*;

public class JFrameTest {
    public static void main(String[] args) {

        new JFrameTest().init();
    }

    //init();  初始化
    public void init() {

        //JFrame   頂級視窗
        JFrame jf = new JFrame("這是一個JFrame視窗");
        jf.setVisible(true);
        jf.setBounds(100,100,500,400);

        //設置文字
        JLabel label = new JLabel("Takagi Takagi Takagi ");

       // jf.add(label);

        label.setHorizontalAlignment(SwingConstants.CENTER);

        /*
        容器實例化，容器的顏色才是他真正的顏色，與AWT不同，所以在這個例子裡使用jf.setBackGround(Color.yellow)
        沒辦法真正設定背景顏色
         */
        // Container container = jf.getContentPane();
        //container.setBackground(Color.yellow);
        jf.getContentPane().setBackground(Color.yellow);
        jf.getContentPane().add(label);

        //關閉事件
        //預設按X就會自動關閉，但是程式部會結束
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);  //按X關閉視窗且結束程式

    }
}
