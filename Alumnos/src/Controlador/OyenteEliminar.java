/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Alumno;
import Modelo.AlumnoBD;
import Vista.VCrearAlumnos;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Usuario
 */
public class OyenteEliminar implements ActionListener{

    VCrearAlumnos vp;
    AlumnoBD abd;
    Alumno a;

    public OyenteEliminar(VCrearAlumnos vp) {
        this.vp = vp;

    }

    @Override
    public void actionPerformed(ActionEvent ae) {

        abd = new AlumnoBD();
        
        abd.eliminar(vp.eliminarAlumno());
        
        vp.limpiarCampos();

    }

}   

