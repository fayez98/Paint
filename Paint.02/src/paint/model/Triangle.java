/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paint.model;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

/**
 *
 * @author Fayez
 */
public class Triangle extends AbsShape{

    public Triangle(boolean fill, int x1, int y1, int x2, int y2, Color colour) {
        super(fill,x1, x2, y1, y2, colour);
    }
    
    @Override
    public void draw(Graphics g) {
        int[]xs={x1,x2,x1-(x2-x1)};
        int[]ys={y1,y2,y2};
        Graphics2D g2=(Graphics2D)g;
        g2.setPaint(colour);
        if(fill)
            g2.fillPolygon(xs,ys,3);
        else
            g2.drawPolygon(xs,ys,3);
    }

    public boolean isFill() {
        return fill;
    }

    public void setFill(boolean fill) {
        this.fill = fill;
    }
}
