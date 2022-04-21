package com.Takagi.lesson02;

import java.awt.*;
import java.awt.event.*;

public class TestText01 {
    public static void main(String[] args) {
        //啟動
        new MyFrame();
    }
}

class MyFrame extends Frame {
    public MyFrame(){
        TextField textField = new TextField();

        //因為繼承自Frame，所以可以直接調用，相當於super.add(textField)
        add(textField);

        setVisible(true);
        pack();
        setLocation(300,300);
        setSize(200,100);

        //監聽這個文本框輸入的文字
        MyActionListener2 myActionListener2 = new MyActionListener2();

        //按下enter就會觸發這個輸入框的事件
        textField.addActionListener(myActionListener2);

        //設置替換編碼
        textField.setEchoChar('*');

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}

 class MyActionListener2 implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        //e.getSource(); 返回的是Object類，向下轉型
        TextField field = (TextField) e.getSource();  //獲得一些資源返回的一些對象
        System.out.println(field.getText());  //獲得輸入框的文本

        //輸入完enter之後清空
        field.setText("");
    }
}
