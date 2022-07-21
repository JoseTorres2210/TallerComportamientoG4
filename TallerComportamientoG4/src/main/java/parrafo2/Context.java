/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parrafo2;

/**
 *
 * @author josel
 */
public class Context {
    private Distribucion distribucion;
    

    
    
    public void setDistribucion(Distribucion tipo){
        this.distribucion=tipo;
    }
        
    public void transportar(){
        distribucion.transportar();
    }
}
