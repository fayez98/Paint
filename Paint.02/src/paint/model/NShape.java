/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paint.model;

/**
 *
 * @author Fayez
 */
public class NShape {
    String name;
    AbsShape shape;

    public NShape(String name, AbsShape shape) {
        this.name = name;
        this.shape = shape;
    }

    public NShape() {
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setShape(AbsShape shape) {
        this.shape = shape;
    }

    public AbsShape getShape() {
        return shape;
    }
    
}
