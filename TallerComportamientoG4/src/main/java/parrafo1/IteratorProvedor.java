/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller_Iterator;

import taller_Iterator.Iterator;
import java.util.LinkedList;

/**
 *
 * @author USER
 */
public class IteratorProvedor implements Iterator{
    private LinkedList<Producto> listaProductos;

    public IteratorProvedor(LinkedList<Producto> listaProductos) {
        this.listaProductos = listaProductos;
    }
    
    @Override
    public Object getNext() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean hasNext() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
