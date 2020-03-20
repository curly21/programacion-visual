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
import javax.swing.JOptionPane;
//
/**
 *
 * @author LENOVO
 */
public class OyenteVerificar implements ActionListener{
   
    VCrearAlumnos vp;
    AlumnoBD abd;
    Alumno a;
    public OyenteVerificar (VCrearAlumnos vp){
		this.vp = vp;
	}
    @Override

    public void actionPerformed(ActionEvent ae) {

      a=abd.buscaralumno(vp.verificaralumno());
       
        if (a.getCedula()== null){
         
            System.out.println("no esta");
               vp.limpiarCampos();
        vp.habilitar();
        }else{
         vp.habilitar();
            JOptionPane.showMessageDialog(vp, "El alumno "+a.getNombre()+" "+a.getApellido()+" ya se encuentra registrado");
     vp.cargarAlumnos(a);
        }
       
           
        
  
        
       
  

    }
    
    
}
