package com.Takagi.lesson04;

import javax.swing.*;
import java.awt.*;

public class JFrameDemo {

    public static void main(String[] args) {
        //建立一個窗口
        new MyJFrame().init();
    }
}

class MyJFrame extends JFrame{

    //init();  初始化
    public void init(){
        setBounds(10,10,200,300);
        setVisible(true);

        JLabel label = new JLabel("Takagi Takagi Takagi");

        //讓文本標籤居中，設置水平對齊
        label.setHorizontalAlignment(SwingConstants.CENTER);

        //獲得一個容器
        Container container = getContentPane();
        container.add(label);
        container.setBackground(Color.yellow);

        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
