package mini_facebook;

import static com.sun.javafx.fxml.expression.Expression.add;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.text.JTextComponent;
import java.awt.Choice;
import java.awt.GridBagConstraints;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Mini_facebook {

    JFrame ventana = new JFrame("Facebook");
    GridBagConstraints contiene = new GridBagConstraints();
    FlowLayout b = new FlowLayout();
    JPanel panel = new JPanel(new GridBagLayout());
    GridBagLayout comp = new GridBagLayout();

//    ETIQUETAS
    JLabel l1 = new JLabel("Corro electronico o telefono");
    JLabel l2 = new JLabel("Contraseña");
    JLabel l3 = new JLabel("¿Has olvidado los datos de la cuenta?");
    JLabel l4 = new JLabel("Registrarte");
    JLabel l5 = new JLabel("Es gratis y lo sera seimpre");
    JLabel l6 = new JLabel("Fecha de nacimiento");
    JLabel l7 = new JLabel("Porque tengo que facilitar mi fecha de nacimieto");
//    BOTONES
    JButton b1 = new JButton("Entrar");
    JButton b2 = new JButton("Registrarte");
    //CAMPO DE TEXTO
    JTextField bt1 = new JTextField("Nombres");
    JTextField bt2 = new JTextField("Apellidos");
    JTextField bt3 = new JTextField("Nùmero de movil o correo electronico");
    JTextField bt4 = new JTextField("Contraseña nueva");
    JTextField bt5 = new JTextField("");
    JTextField bt6 = new JTextField("");
    //LISTAS
    Choice listadia = new Choice();
    Choice listames = new Choice();
    Choice listaño = new Choice();
    //BOTON CON CIRCULO
    JRadioButton h = new JRadioButton("Hombre");
    JRadioButton m = new JRadioButton("Mujer");

    public Mini_facebook() {
        panel.setLayout(comp);

        //  Listas dia,mes,año
        String[] dias = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"};
        for (int i = 0; i < dias.length; i++) {
            this.listadia.addItem(dias[i]);
        }
        String[] mes = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};

        for (int j = 0; j < mes.length; j++) {
            this.listames.addItem(mes[j]);
        }
        String[] años = {"1998", "1997", "1997", "1996", "1995", "1994", "1993", "1992", "1991", "1990", "1989", "1988", "1987", "1986"};
      for (int l = 0; l < dias.length; l++) {
          this.listaño.add(años[l]);
       }

        ventana.setSize(300, 857);
        ventana.setVisible(true);
        ventana.pack();
        

    }

    public void agregarcomponente() {
        ventana.getContentPane().add(panel);

        //0
        contiene.gridx = 0;
        contiene.gridy = 0;
        contiene.gridwidth = 1;
        contiene.gridheight = 1;
        panel.add(l1);
       comp.addLayoutComponent(l1, contiene);

//
        contiene.gridx = 0;
        contiene.gridy = 0;
        contiene.gridwidth = 1;
        contiene.gridheight = 1;
        panel.add(l1);
        ventana.add(l1, contiene);
        //
        contiene.gridx = 0;
        contiene.gridy = 1;
        contiene.gridwidth = 1;
        contiene.gridheight = 1;
        panel.add(l2);
        ventana.add(l2);
        //
        contiene.gridx = 1;
        contiene.gridy = 0;
        contiene.gridwidth = 1;
        contiene.gridheight = 1;
//        panel.add(bt5);
        ventana.add(bt5, contiene);
        //
        contiene.gridx = 1;
        contiene.gridy = 1;
        contiene.gridwidth = 1;
        contiene.gridheight = 1;
        panel.add(bt6);
        //
        contiene.gridx = 1;
        contiene.gridy = 4;
        contiene.gridwidth = 1;
        contiene.gridheight = 1;
        panel.add(b1);
        //
        contiene.gridx = 2;
        contiene.gridy = 1;
        contiene.gridwidth = 1;
        contiene.gridheight = 2;
        panel.add(l3);
        
        //
        contiene.gridx = 1;
        contiene.gridy = 4;
        contiene.gridwidth = 1;
        contiene.gridheight = 1;
        panel.add(b1);
        //
        contiene.gridx = 2;
        contiene.gridy = 1;
        contiene.gridwidth = 1;
        contiene.gridheight = 1;
        panel.add(l4);
        //
        contiene.gridx = 3;
        contiene.gridy = 1;
        contiene.gridwidth = 1;
        contiene.gridheight = 1;
        panel.add(l5);
        //
        contiene.gridx = 4;
        contiene.gridy = 1;
        contiene.gridwidth = 1;
        contiene.gridheight = 1;
        panel.add(bt1);
        //
        contiene.gridx = 4;
        contiene.gridy = 2;
        contiene.gridwidth = 1;
        contiene.gridheight = 1;
        panel.add(bt2);
        //
        contiene.gridx = 5;
        contiene.gridy = 1;
        contiene.gridwidth = 1;
        contiene.gridheight = 2;
        panel.add(bt3);
        //
        contiene.gridx = 6;
        contiene.gridy = 1;
        contiene.gridwidth = 1;
        contiene.gridheight = 2;
        panel.add(bt4);
        //
        contiene.gridx = 7;
        contiene.gridy = 1;
        contiene.gridwidth = 1;
        contiene.gridheight = 1;
        panel.add(l6);
        //
        contiene.gridx = 8;
        contiene.gridy = 1;
        contiene.gridwidth = 1;
        contiene.gridheight = 1;
        panel.add(listadia);
        //
        contiene.gridx = 8;
        contiene.gridy = 2;
        contiene.gridwidth = 1;
        contiene.gridheight = 1;
        panel.add(listames);
        
        //
        contiene.gridx = 8;
        contiene.gridy = 3;
        contiene.gridwidth = 1;
        contiene.gridheight = 1;
        panel.add(listaño);
        //
        contiene.gridx = 8;
        contiene.gridy = 4;
        contiene.gridwidth = 1;
        contiene.gridheight = 1;
        panel.add(l7);
        //
        contiene.gridx = 9;
        contiene.gridy = 1;
        contiene.gridwidth = 1;
        contiene.gridheight = 1;
        panel.add(m);
        //
        contiene.gridx = 9;
        contiene.gridy = 2;
        contiene.gridwidth = 1;
        contiene.gridheight = 1;
        panel.add(h);
        //
        contiene.gridx = 12;
        contiene.gridy = 1;
        contiene.gridwidth = 1;
        contiene.gridheight = 1;
        panel.add(b2);
        ventana.setVisible(true);
        ventana.setSize(300, 857);
        ventana.setVisible(true);
        ventana.pack();

    }

    public static void main(String[] args) {

Mini_facebook obj = new mini_facebook.Mini_facebook();
//a.agregarcomponente();


        
    }

}
