package com.haimo;

import com.haimo.drawings.Drawing;

import java.awt.*;

public class anotherDrawing extends Drawing {
    int width = 100, height = 30;

    public void paint(Graphics g) {
        g.drawOval(x, y, width, height);
    }

}
