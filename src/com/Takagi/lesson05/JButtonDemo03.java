package com.Takagi.lesson05;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class JButtonDemo03 extends JFrame {
    public JButtonDemo03(){
        Container container = this.getContentPane();

        //將一個圖片變為圖標
        URL resource = JButtonDemo01.class.getResource("Sasuke.jpg");
        Icon icon = new ImageIcon(resource);

        //多選框
        JCheckBox jCheckBox01 = new JCheckBox("jCheckBox1");
        JCheckBox jCheckBox02 = new JCheckBox("jCheckBox2");
        JCheckBox jCheckBox03 = new JCheckBox("jCheckBox3");

        //默認為置中  container.setLayout(new FlowLayout());

        container.setLayout(new FlowLayout(FlowLayout.LEFT));


        container.add(jCheckBox01);
        container.add(jCheckBox02);
        container.add(jCheckBox03);




        this.setVisible(true);
        this.setSize(500,300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new JButtonDemo03();
    }
}
