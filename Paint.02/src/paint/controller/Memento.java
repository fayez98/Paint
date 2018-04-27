/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paint.controller;
import paint.model.*;
import java.util.ArrayList;

/**
 *
 * @author Fayez
 */
public class Memento {
    ArrayList<NShape> shapes;

    public Memento(ArrayList<NShape> shapes) {
        this.shapes = shapes;
    }

    public ArrayList<NShape> getShapes() {
        return shapes;
    }
    
}
