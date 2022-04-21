package com.Takagi.lesson04;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class ImageIconDemo extends JFrame {
    public ImageIconDemo() {

        JLabel label = new JLabel("ImageIcon");
        //獲取圖片的地址
        URL url = ImageIconDemo.class.getResource("Rem_Rum.jpg");//獲取當前這個class下的同級資源
        //即圖片需要與ImageIconDemo位於同一個資料夾下(lesson04)

        ImageIcon imageIcon = new ImageIcon(url);
        label.setIcon(imageIcon);
        label.setHorizontalAlignment(SwingConstants.CENTER);

        Container container = getContentPane();
        container.add(label);

        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setBounds(100,100,200,200);

    }

    public static void main(String[] args) {
        new ImageIconDemo();
    }
}
