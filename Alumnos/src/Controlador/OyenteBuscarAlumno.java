/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.AlumnoBD;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Usuario
 */
public class OyenteBuscarAlumno implements ActionListener{
    AlumnoBD b= new AlumnoBD();
    
    @Override
    public void actionPerformed(ActionEvent ae) {
     b.buscaralumno(null);
    }
    
}
