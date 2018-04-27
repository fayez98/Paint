/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paint.controller;

import paint.model.Shape;

/**
 *
 * @author Fayez
 */
public interface DrawingEngine {
    public void refresh(Object canvas);
    public void addShape(Shape shape);
    public void removeShape(Shape shape);
    public void updateShape(Shape oldShape, Shape newShape);
    public Shape[] getShapes();
    /* limited to 20 steps. You consider these actions in
    * undo & redo: addShape, removeShape, updateShape */
    public void undo();
    public void redo();
    /* use the file extension to determine the type,
    * or throw runtime exception when unexpected extension */
    public void save(String path);
    public void load(String path);
    
}
