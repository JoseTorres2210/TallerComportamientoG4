/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parrafo3;

import com.mycompany.chainofresponsability.SolicitudCambio;
import com.mycompany.chainofresponsability.Verificador;

/**
 *
 * @author josue
 */
public class DepAtencionUsuario implements Verificador{
    
    private Verificador sucesor;

    @Override
    public void setSucesor(Verificador sucesor) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void procesarSolicitud(SolicitudCambio solicitud) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}