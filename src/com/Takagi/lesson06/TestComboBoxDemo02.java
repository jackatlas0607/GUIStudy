package com.Takagi.lesson06;

import javax.swing.*;
import java.awt.*;

public class TestComboBoxDemo02 extends JFrame {
    public TestComboBoxDemo02(){
        Container container = this.getContentPane();

        //生成列表的內容
        String[] contents = {"1","2","3"};

        //列表中需要放入內容
        JList list = new JList(contents);

        container.add(list);


        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setSize(500,300);
        this.setVisible(true);
    }


    public static void main(String[] args) {
        new TestComboBoxDemo02();
    }
}
