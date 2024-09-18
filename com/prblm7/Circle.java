package com.prblm7;

import java.awt.*;
import javax.swing.*;

public class Circle implements Drawable {
    public void draw(){
        System.out.println("Circle drawn!!!1");
        JFrame  frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setVisible(true);

        JPanel  panel = new JPanel(){
            public void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.setColor(Color.BLACK);
                g.drawOval(50, 50, 200, 200);
            }
        };
        
        frame.add(panel);
    }
    
}
