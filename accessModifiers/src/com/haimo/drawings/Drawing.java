package com.haimo.drawings;

import java.awt.Graphics;

public class Drawing {
    protected int x=40, y=40, width=40, height=40;

    public void paint(Graphics g){
        g.drawOval(x, y, width, height);
    }
}