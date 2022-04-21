package com.Takagi.lesson04;

import javax.swing.*;
import java.awt.*;

//圖標示一個接口，需要實現類，以Frame繼承的方式來實現
public class ICONDemo extends JFrame implements Icon {

    public static void main(String[] args) {
          new ICONDemo().init();
    }

    private int width;
    private int height;

    public ICONDemo() {

    }

    public ICONDemo(int width, int height)  {
        this.width = width;
        this.height = height;
    }

    public void init(){
        ICONDemo iconDemo = new ICONDemo(15, 15);

        //圖標放在標籤也可以放在按鈕上!
        JLabel label = new JLabel("icontest", iconDemo, SwingConstants.CENTER);

        Container container = this.getContentPane();
        container.add(label);

        this.setBounds(100,100,200,100);
        this.setVisible(true);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


    }

    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {
        g.fillOval(x,y,width,height);
    }

    @Override
    public int getIconWidth() {
        return this.width;
    }

    @Override
    public int getIconHeight() {
        return this.height;
    }


}
