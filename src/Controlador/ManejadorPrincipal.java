/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.AlmacenamientoEstudiante;
import Vista.VentanitaEstudiante;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/**
 *
 * @author llasu
 */
public class ManejadorPrincipal implements ActionListener {

    private AlmacenamientoEstudiante alm;
    private VentanitaEstudiante ventanita;
    public ManejadorPrincipal() {
        alm = new AlmacenamientoEstudiante();
        ventanita = new VentanitaEstudiante(alm);
    }
    

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("Manipular estudiantes")){
            ventanita.setVisible(true);
        }  
    }
    
}
