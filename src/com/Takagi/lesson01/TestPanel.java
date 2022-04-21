package com.Takagi.lesson01;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

//Panel 面板  ， 可以看成是一個空間，但是不能單獨存在
public class TestPanel {
    public static void main(String[] args) {
        Frame frame = new Frame();

        //布局的概念
        Panel panel = new Panel();

        //設置布局
        frame.setLayout(null);

        //座標
        frame.setBounds(300,300,500,500);
        frame.setBackground(new Color(40,161,35));

        //Panel設置座標，相對於Frame
        //因為面板添加進去Frame，所以使用相對座標，以Frame左上角為(0,0)
        panel.setBounds(50,50,400,400);
        panel.setBackground(new Color(193,15,60));

        //frame.add(panel) 把panel放進視窗
        //看原碼 Panel extends Container    Container extends Component  所以Pannel可以放進去Component
        frame.add(panel);

        //設置可見性
        frame.setVisible(true);


        //監聽事件，監聽視窗關閉事件  System.exit(0)

        /*
        若放入WindowListener()實例，則必須重寫所有WindowListener接口的所有方法(接口方法，默認為抽象)
        frame.addWindowListener(new WindowListener() {
            @Override
            public void windowOpened(WindowEvent e) {

            }

            @Override
            public void windowClosing(WindowEvent e) {

            }

            @Override
            public void windowClosed(WindowEvent e) {

            }

            @Override
            public void windowIconified(WindowEvent e) {

            }

            @Override
            public void windowDeiconified(WindowEvent e) {

            }

            @Override
            public void windowActivated(WindowEvent e) {

            }

            @Override
            public void windowDeactivated(WindowEvent e) {

            }
        });
        */

        //WindowAdapter可以選擇其中所需要的方法重寫即可
        /*
        public abstract class WindowAdapter
        implements WindowListener, WindowStateListener, WindowFocusListener
          */

        frame.addWindowListener(new WindowAdapter() {
            //窗口點擊關閉須要做的事情
            @Override
            public void windowClosing(WindowEvent e) {
                //結束程序
                System.exit(0);
            }
        });
    }
}
