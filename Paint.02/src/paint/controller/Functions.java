/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paint.controller;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;
import javafx.scene.paint.Color;
import paint.model.*;

/**
 *
 * @author Fayez
 */
public class Functions {
    
    public void refresh(ArrayList<NShape> a,Graphics g,Canvas c){
        Graphics2D g2=(Graphics2D) g;
        g.clearRect(0, 0,c.getWidth(),c.getHeight());
        for(NShape s: a){
            if(s.getName().equals("line")){
                Line l= (Line) s.getShape();
                l.draw(g);
            }
            if(s.getName().equals("Square")){
                Square S=(Square) s.getShape();
                S.draw(g);
            }
            if(s.getName().equals("Rectangle")){
                Rectangle r=(Rectangle) s.getShape();
                r.draw(g);
            }
            if(s.getName().equals("Circle")){
                Circle C=(Circle) s.getShape();
                C.draw(g);
            }
            if(s.getName().equals("Triangle")){
                Triangle t=(Triangle) s.getShape();
                t.draw(g);
            }
            if(s.getName().equals("Ellipse")){
                Ellipse r=(Ellipse) s.getShape();
                r.draw(g);
            }
        }
    }
    
    public boolean Between(int x,int y,int z){
        if(x>=z&&x<=y)
            return true;
        if(x<=z&&x>=y)
            return true;
        return false;
    }
    
    public int contains(NShape s,int x,int y){
         if(s.getName().equals("line")){
                
            }
            if(s.getName().equals("Square")){
                if(Between(x,s.getShape().getX1(),s.getShape().getX2())&&Between(y,s.getShape().getY1(),s.getShape().getY2()))
                    return 1;
                else 
                    return 0;
            }
            if(s.getName().equals("Rectangle")){
                if(Between(x,s.getShape().getX1(),s.getShape().getX2())&&Between(y,s.getShape().getY1(),s.getShape().getY2()))
                    return 1;
                else 
                    return 0;
            }
            if(s.getName().equals("Circle")){
                if(Between(x,s.getShape().getX1(),s.getShape().getX2())&&Between(y,s.getShape().getY1(),s.getShape().getY1()+Math.abs(s.getShape().getX1()-s.getShape().getX2())))
                    return 1;
                else 
                    return 0;
                }
            if(s.getName().equals("Triangle")){
            }
            if(s.getName().equals("Ellipse")){
                if(Between(x,s.getShape().getX1(),s.getShape().getX2())&&Between(y,s.getShape().getY1(),s.getShape().getY2()))
                    return 1;
                else
                    return 0;
            }
        return 0;
    }
    
    public void copy(ArrayList<NShape> shapes,Graphics g,Canvas can,int[] X,int[] Y){
        Graphics2D g2=(Graphics2D)g;
            int dx=X[1]-X[0];
            int dy=Y[1]-Y[0];
            for(int i=shapes.size()-1;i>=0;i--){
                if(contains(shapes.get(i),X[0],Y[0])==1){
                        if(shapes.get(i).getName().equals("Rectangle")){
                            Rectangle R=(Rectangle) shapes.get(i).getShape();
                            Rectangle RR=new Rectangle(R.isFill(),R.getX1()+dx,R.getY1()+dy,R.getX2()+dx,R.getY2()+dy,R.getColour());
                            NShape neww=new NShape("Rectangle",RR);
                            shapes.add(neww);
                        }
                        if(shapes.get(i).getName().equals("Square")){
                            Square R=(Square) shapes.get(i).getShape();
                            Square RR=new Square(R.isFill(),R.getX1()+dx,R.getY1()+dy,R.getX2()+dx,R.getY2()+dy,R.getColour());
                            NShape neww=new NShape("Square",RR);
                            shapes.add(neww);
                        }
                        if(shapes.get(i).getName().equals("Circle")){
                            Circle R=(Circle) shapes.get(i).getShape();
                            Circle RR=new Circle(R.isFill(),R.getX1()+dx,R.getY1()+dy,R.getX2()+dx,R.getY2()+dy,R.getColour());
                            NShape neww=new NShape("Circle",RR);
                            shapes.add(neww);
                        }
                        if(shapes.get(i).getName().equals("Ellipse")){
                            Ellipse R=(Ellipse) shapes.get(i).getShape();
                            Ellipse RR=new Ellipse(R.isFill(),R.getX1()+dx,R.getY1()+dy,R.getX2()+dx,R.getY2()+dy,R.getColour());
                            NShape neww=new NShape("Ellipse",RR);
                            shapes.add(neww);
                        }
                        if(shapes.get(i).getName().equals("Triangle")){
                            Triangle R=(Triangle) shapes.get(i).getShape();
                            Triangle RR=new Triangle(R.isFill(),R.getX1()+dx,R.getY1()+dy,R.getX2()+dx,R.getY2()+dy,R.getColour());
                            NShape neww=new NShape("Triangle",RR);
                            shapes.add(neww);
                        }
                        break;
                }    
            }   
            refresh(shapes, g, can);
    }
    
    public void copylist(ArrayList<NShape> main,ArrayList<NShape> sub){
        for(NShape n:main){
            sub.add(n);
        }
    }
}
