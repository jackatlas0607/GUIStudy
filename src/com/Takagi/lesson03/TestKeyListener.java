package com.Takagi.lesson03;

import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TestKeyListener {
    public static void main(String[] args) {
        new KeyFrame();
    }
}

class KeyFrame extends Frame {
    public KeyFrame() {
        setBounds(1,2,300,400);
        setVisible(true);

        this.addKeyListener(new KeyAdapter() {
            //鍵盤按下
            @Override
            public void keyPressed(KeyEvent e) {
                //獲得鍵盤按下的鑑識哪一個，2;當前的碼
                int keyCode = e.getKeyCode();  //keyCode都是用Unicode編碼儲存，所以返回int類型
                System.out.println(keyCode);
                if (keyCode==KeyEvent.VK_UP){   //不需要去記keycode的值，直接使用靜態屬性VK_XXX
                    System.out.println("你按下了UP鍵");
                }
                //根據按下的不同操作，產生不同結果
            }
        });

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}
