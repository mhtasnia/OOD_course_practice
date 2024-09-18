package com.prblm7;

import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Rectangle implements Drawable{
    public void draw(){
        System.out.println("Drawing a Rectangle");
         JFrame  frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setVisible(true);

        JPanel  panel = new JPanel(){
            public void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.setColor(Color.BLUE);
                
                g.fillRect(100, 100, 200, 200);
            }
        };
        frame.add(panel);
    }
    
}
