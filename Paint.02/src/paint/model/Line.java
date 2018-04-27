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
public class Line extends AbsShape{

    public Line(boolean fill,int x1,int y1,int x2, int y2, Color colour) {
        super(fill,x1, x2, y1, y2, colour);
    }
    @Override
    public void draw(Graphics g) {
        Graphics2D g2=(Graphics2D)g;
        g2.setPaint(colour);
        g2.setColor( getColour());
        g2.drawLine(getX1(),getY1(),getX2(),getY2());
    }
    
}
