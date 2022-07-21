/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parrafo3;

/**
 *
 * @author josue
 */
public class SolicitudCambio {
    private String informacion;
    private double precio;

    public SolicitudCambio(String informacion, double precio) {
        this.informacion = informacion;
        this.precio = precio;
        
        // creae los verificadores 
        
        if(precio > 1000){
            // elige como el ultimo sucesor al GerenteTienda
        }
    }

    
    
    public String getInformacion() {
        return informacion;
    }

    public void setInformacion(String informacion) {
        this.informacion = informacion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    
    
}
