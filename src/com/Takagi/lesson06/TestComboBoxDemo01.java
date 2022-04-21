package com.Takagi.lesson06;

import javax.swing.*;
import java.awt.*;

//下拉框
public class TestComboBoxDemo01 extends JFrame {
    public TestComboBoxDemo01(){

        Container container = this.getContentPane();

        JComboBox status = new JComboBox();
        status.addItem(null);
        status.addItem("正在熱映");
        status.addItem("已下架");
        status.addItem("即將上映");

        container.add(status);


        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setSize(500,300);
        this.setVisible(true);
    }


    public static void main(String[] args) {
        new TestComboBoxDemo01();
    }

}
