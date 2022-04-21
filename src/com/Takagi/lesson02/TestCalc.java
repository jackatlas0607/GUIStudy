package com.Takagi.lesson02;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

//簡易計算器
public class TestCalc {
    public static void main(String[] args) {
         new Calculator().loadFrame();
    }
}

//計算器類
class Calculator extends Frame {

    //屬性
    TextField num1,num2,num3;

    //方法
    public void loadFrame(){
        //3個文本框
         num1 = new TextField(10); //參數為最多可以填的字符數
         num2 = new TextField(10);
         num3 = new TextField(20);

        //1個按鈕
        Button button = new Button("=");

        //1個標籤
        Label label = new Label("+");


        //加入監聽事件
        button.addActionListener(new MyCalculatorListener());


        //布局
        setLayout(new FlowLayout());

        add(num1);
        add(label);
        add(num2);
        add(button);
        add(num3);

        pack();  //自適應大小
        setVisible(true);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

    }
    //監聽器類(inner class)
    //內部類最大好處就是可以暢通無阻的訪問外部類的屬性和方法
    private class MyCalculatorListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            //1.獲得加數和被加數
            //2.將這個值 + 法運算後，放到第三個框
            //3.清除前兩個框
            int n1 = Integer.parseInt(num1.getText());
            int n2 = Integer.parseInt(num2.getText());
            num3.setText(""+(n1+n2));
            num1.setText("");
            num2.setText("");

        }
    }

}

