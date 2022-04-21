package com.Takagi.lesson04;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//主窗口
public class DialogDemo extends JFrame {

    public DialogDemo() {
        //因為繼承JFrame,所以可以直接調用JFrame的方法
        setVisible(true);
        setSize(700, 500);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); //關閉時會結束程式

        //JFrame 放東西，容器
        Container container = getContentPane();

        //絕對布局  (直接 x y 座標定位)
        //JFrame預設是使用BorderLayout
        container.setLayout(null);

        //按鈕
        JButton button = new JButton("點擊彈出一個對話框");
        button.setBounds(30,30,200,50);

        //點擊這個按鈕的時候彈出一個視窗
        button.addActionListener(new ActionListener() {  //監控器
            @Override
            public void actionPerformed(ActionEvent e) {
                //彈出視窗
                new MyDialog();
            }
        });

        container.add(button);

    }


    public static void main(String[] args) {
            new DialogDemo();
    }
}

//彈窗的窗口
class MyDialog extends JDialog{
    public MyDialog() {
        this.setVisible(true);
        this.setBounds(100,100,500,500);

        Container container = this.getContentPane();
        JLabel label = new JLabel("Takagi Kurumi Origami");
        label.setHorizontalAlignment(SwingConstants.CENTER);

        //沒設置layout預設為BorderLayout
        /*
        彈出的視窗由於使用絕對布局container.setLayout(null);
        則須再設置label.setBounds(100,100,400,100);
         */

        container.add(label);
        //container.setLayout(null);

    }
}

