/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paint.controller;

import java.util.ArrayList;

/**
 *
 * @author Fayez
 */
public class Caretaker {
    ArrayList<Memento> savedshapes=new ArrayList<>();
    
    public void addMemento(Memento m){
        savedshapes.add(m);
    }

    public Memento getMemento(int index){
        return savedshapes.get(index);
    }
}
