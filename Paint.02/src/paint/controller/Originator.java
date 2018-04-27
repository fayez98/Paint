/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paint.controller;

import java.util.ArrayList;
import paint.model.NShape;

/**
 *
 * @author Fayez
 */
public class Originator {
    ArrayList<NShape> shapes;

    public void setShapes(ArrayList<NShape> shapes) {
        this.shapes = shapes;
    }
    
    public Memento StoreMemento(ArrayList<NShape> shapes){
        return new Memento(shapes);
    }
    
    public ArrayList<NShape> RestoreMemento(Memento memento){
        shapes=memento.getShapes();
        return shapes;
    }
}
