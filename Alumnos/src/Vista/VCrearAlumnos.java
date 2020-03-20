package Vista;

import Controlador.OyenteActualizar;
import Controlador.OyenteCrearAlumno;
import Controlador.OyenteVPrincipal;
import Controlador.OyenteVerificar;
import Modelo.Alumno;
import Modelo.AlumnoBD;
import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Locale;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class VCrearAlumnos extends JFrame {
    AlumnoBD bd;
    JPanel p = new JPanel();
    JLabel ced = new JLabel("Cédula");
    JTextField ced1 = new JTextField(15);
    JLabel nom = new JLabel("Nombres");
    JTextField nom1 = new JTextField(15);
    JLabel ape = new JLabel("Apellidos");
    JTextField ape1 = new JTextField(15);
    JLabel direc = new JLabel("Dirección");
    JTextField direc1 = new JTextField(15);
    JLabel tel = new JLabel("Teléfono");
    JTextField tel1 = new JTextField(15);
    JLabel corr = new JLabel("Correo");
    JTextField corr1 = new JTextField(15);
    JLabel carre = new JLabel("Carrera");
    JTextField carre1 = new JTextField(15);
    JLabel mod = new JLabel("Modulo");
    JTextField mod1 = new JTextField(15);
    JButton crear = new JButton("Crear");
    JButton cerr = new JButton("Cerrar");
    JButton ver = new JButton("Verificar");
     JButton act = new JButton("Actualizar");
      JButton eli = new JButton("Eliminar");
    private Alumno alumno = new Alumno();
 private Alumno obj = new Alumno();
    public JTextField getCed1() {
        return ced1;
    }

    public void setCed1(JTextField ced1) {
        this.ced1 = ced1;
    }

    public JTextField getNom1() {
        return nom1;
    }

    public void setNom1(JTextField nom1) {
        this.nom1 = nom1;
    }

    public JTextField getApe1() {
        return ape1;
    }

    public void setApe1(JTextField ape1) {
        this.ape1 = ape1;
    }

    public JTextField getDirec1() {
        return direc1;
    }

    public void setDirec1(JTextField direc1) {
        this.direc1 = direc1;
    }

    public JTextField getTel1() {
        return tel1;
    }

    public void setTel1(JTextField tel1) {
        this.tel1 = tel1;
    }

    public JTextField getCorr1() {
        return corr1;
    }

    public void setCorr1(JTextField corr1) {
        this.corr1 = corr1;
    }

    public JTextField getCarre1() {
        return carre1;
    }

    public void setCarre1(JTextField carre1) {
        this.carre1 = carre1;
    }

    public JTextField getMod1() {
        return mod1;
    }

    public void setMod1(JTextField mod1) {
        this.mod1 = mod1;
    }

    public VCrearAlumnos() {
        p.setBackground(new Color(96,160,198));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        agregarComponentes();
        setVisible(true);
        this.setLocationRelativeTo(null);
       pack();

    }

    public void agregarComponentes() {
        getContentPane().add(p);
        p.setLayout(new GridBagLayout());
        GridBagConstraints gb = new GridBagConstraints();
        gb.gridx = 0;
        gb.gridy = 0;
        gb.insets = new Insets(10, 10, 10, 10);
        p.add(ced, gb);
        
        gb.gridx = 0;
        gb.gridy = 1;
        p.add(nom, gb);
        
        
        gb.gridx = 0;
        gb.gridy = 2;
        p.add(ape, gb);
        
        ced1.setBorder(BorderFactory.createLineBorder(Color.black));
        gb.gridx = 1;
        gb.gridy = 0;
        p.add(ced1, gb);
        
        nom1.setBorder(BorderFactory.createLineBorder(Color.black));
        gb.gridx = 1;
        gb.gridy = 1;
        p.add(nom1, gb);
        
        ape1.setBorder(BorderFactory.createLineBorder(Color.black));
        gb.gridx = 1;
        gb.gridy = 2;
        p.add(ape1, gb);
        
        gb.gridx = 0;
        gb.gridy = 5;
        p.add(direc, gb);
        
        direc1.setBorder(BorderFactory.createLineBorder(Color.black));
        gb.gridx = 1;
        gb.gridy = 5;
        p.add(direc1, gb);
        
        gb.gridx = 0;
        gb.gridy = 7;
        p.add(tel, gb);
        
        tel1.setBorder(BorderFactory.createLineBorder(Color.black));
        gb.gridx = 1;
        gb.gridy = 7;
        p.add(tel1, gb);
        
        gb.gridx = 0;
        gb.gridy = 9;
        p.add(carre, gb);
        carre1.setBorder(BorderFactory.createLineBorder(Color.black));
        gb.gridx = 1;
        gb.gridy = 9;
        p.add(carre1, gb);
        
        gb.gridx = 0;
        gb.gridy = 11;
        p.add(mod, gb);
        
        mod1.setBorder(BorderFactory.createLineBorder(Color.black));
        gb.gridx = 1;
        gb.gridy = 11;
        p.add(mod1, gb);
       
        gb.gridx = 0;
        gb.gridy = 13;
        p.add(corr, gb);
        
        corr1.setBorder(BorderFactory.createLineBorder(Color.black));
        gb.gridx = 1;
        gb.gridy = 13;
        p.add(corr1, gb);
        
        
       crear.setBorder(BorderFactory.createRaisedBevelBorder());
       crear.setBackground(new Color(146,142,140));
         crear.setLayout(new FlowLayout(FlowLayout.CENTER));
          crear.setPreferredSize(new Dimension(70, 30));
          crear.setFont(new Font ("Arial",Font.ROMAN_BASELINE,18));
        gb.gridx = 0;
        gb.gridy = 20;
        p.add(crear, gb);
        
        cerr.setBorder(BorderFactory.createRaisedBevelBorder());
        cerr.setBackground(new Color(146,142,140));
          cerr.setLayout(new FlowLayout(FlowLayout.CENTER));
          cerr.setPreferredSize(new Dimension(70, 30));
           cerr.setFont(new Font ("Arial",Font.ROMAN_BASELINE,18));
        gb.gridx = 1;
        gb.gridy = 20;
        p.add(cerr, gb);
        
        ver.setBorder(BorderFactory.createRaisedBevelBorder());
        ver.setBackground(new Color(146,142,140));
          ver.setLayout(new FlowLayout(FlowLayout.CENTER));
          ver.setPreferredSize(new Dimension(70, 30));
           ver.setFont(new Font ("Arial",Font.ROMAN_BASELINE,18));
        gb.gridx = 2;
        gb.gridy = 0;
        p.add(ver,gb);
        
        act.setBorder(BorderFactory.createRaisedBevelBorder());
        act.setBackground(new Color(146,142,140));
        act.setLayout(new FlowLayout(FlowLayout.CENTER));
          act.setPreferredSize(new Dimension(80, 30));
          act.setFont(new Font ("Arial",Font.ROMAN_BASELINE,18));
        gb.gridx = 2;
        gb.gridy = 20;
        p.add(act,gb);
        
        eli.setBorder(BorderFactory.createRaisedBevelBorder());
        eli.setBackground(new Color(146,142,140));
        eli.setLayout(new FlowLayout(FlowLayout.CENTER));
         eli.setPreferredSize(new Dimension(80, 30));
         eli.setFont(new Font ("Arial",Font.ROMAN_BASELINE,18));
        gb.gridx = 3;
        gb.gridy = 20;
        p.add(eli,gb);
        
//deshabilitar();
        crear.addActionListener(new OyenteCrearAlumno(this));
        cerr.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);

            }

        });
        ver.addActionListener(new OyenteVerificar(this));
        
        act.addActionListener(new OyenteActualizar ());
    }

    public Alumno guardarAlumno() {
        alumno = new Alumno();
        alumno.setCedula(ced1.getText());
        alumno.setNombre(nom1.getText());
        alumno.setApellido(ape1.getText());
        alumno.setDireccion(direc1.getText());
        alumno.setTeléfono(tel1.getText());
        alumno.setCorreo(corr.getText());
        alumno.setCarrera(carre1.getText());
        alumno.setModulo(mod1.getText());
        return alumno;
    }
    
      public Alumno eliminarAlumno() {
        alumno.setCedula(ced1.getText());
        return alumno;
    }
//   
     public Alumno BuscarAlumno() {
        alumno.setCedula(ced1.getText());
        return alumno;
    }
public void limpiarCampos() {

        ced1.setText("");
        nom1.setText("");
        ape1.setText("");
        direc1.setText("");
        tel1.setText("");
        corr1.setText("");
        mod1.setText("");
        carre1.setText("");
    }
public void habilitar (){
ced1.setEditable(true);
nom1.setEditable(true);
ape1.setEditable(true);
direc1.setEditable(true);
tel1.setEditable(true);
corr1.setEditable(true);
mod1.setEditable(true);
crear.setEnabled(true);
carre1.setEditable(true);


}
public void deshabilitar (){
carre1.setEditable(false);
nom1.setEditable(false);
ape1.setEditable(false);
direc1.setEditable(false);
tel1.setEditable(false);
corr1.setEditable(false);
mod1.setEditable(false);
crear.setEnabled(false);



}
public String verificaralumno(){
return ced1.getText();
}

public void cargarAlumnos(Alumno alumno){
   ced1.setText(alumno.getCedula());
nom1.setText(alumno.getNombre());
ape1.setText(alumno.getApellido());
direc1.setText(alumno.getDireccion());
tel1.setText(alumno.getTeléfono());

corr1.setText(alumno.getCorreo());
carre1.setText(alumno.getCarrera());
mod1.setText(alumno.getModulo());

}
 public Alumno alumnoact() {
        alumno = new Alumno();
        alumno.setCedula(ced1.getText());
        alumno.setNombre(nom1.getText());
        alumno.setApellido(ape1.getText());
        alumno.setDireccion(direc1.getText());
        alumno.setCarrera(carre1.getText());
        alumno.setModulo(mod1.getText());
        alumno.setCorreo(corr1.getText());
        return alumno;
    }



    public static void main(String[] args) {
        new VCrearAlumnos();
    }







}
