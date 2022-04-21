package com.Takagi.lesson04;

import javax.swing.*;
import java.awt.*;
import java.net.URL;


//個人比較喜歡這種寫法
public class ImageIconTest {
    public static void main(String[] args) {
          new ImageIconTest().init();
    }

    public void init(){
        JFrame reZero = new JFrame("ReZero");
        JLabel label = new JLabel("ImageIcon");
        URL url = ImageIconDemo.class.getResource("Rem_Rum.jpg");
        ImageIcon imageIcon = new ImageIcon(url);
        label.setIcon(imageIcon);
        label.setHorizontalAlignment(SwingConstants.CENTER);

        Container container = reZero.getContentPane();
        container.add(label);

        reZero.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //reZero.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //上面兩行都是關閉視窗且結束程序

        reZero.setBounds(100,100,500,300);
        reZero.setVisible(true);


    }


}
