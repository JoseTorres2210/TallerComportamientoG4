/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.chainofresponsability;

/**
 *
 * @author josue
 */
public interface Verificador {
    Verificador sucesor = null;
    
    
    public void setSucesor(Verificador sucesor);
    
    public void procesarSolicitud(SolicitudCambio solicitud);
    
}
