package com.prblm7;

import java.awt.*;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Triangle implements Drawable{
    public void draw(){
        System.out.println("Drawing a triangle");
        JFrame  frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700, 900);
        frame.setVisible(true);

        JPanel  panel = new JPanel(){
            public void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.setColor(Color.BLACK);
                int[] xPoints = {
                    200,
                    100,
                    300
                };
                int[] yPoints = {
                    100,
                    300,
                    300
                };
                g.fillPolygon(xPoints, yPoints, 3);
            }
        };
        frame.add(panel);
    }
}
