package juego_años;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public final class vprincipal extends JFrame {

    JLabel l1 = new JLabel("Bienvenido, vamos a jugar");
    JTextField t = new JTextField(20);
    JButton b = new JButton("Verificar");
    JComboBox cb = new JComboBox();
    JPanel panel = new JPanel(new GridBagLayout());
    GridBagConstraints g = new GridBagConstraints();
    vresultado v2 = new vresultado();

//    String txt = t.getText();
//    int n = Integer.parseInt(txt);

    public vprincipal() {

        super("Juego");
        setSize(300, 300);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

        cb.addItem("Numero de semana del año");
        cb.addItem("Dia del año");
        cb.addItem("Numero de segundos");
        cb.addItem("Numero del dia de la semana ");
        add_comp();
//        eleccion();
//        n_segundos();
//        n_semana();
//        nd_semana();
//        d_año();
        pack();
    }

    public void add_comp() {
        this.getContentPane().add(panel);
        g.gridx = 0;
        g.gridy = 0;
        panel.add(l1, g);
        g.gridx = 0;
        g.gridy = 1;
        panel.add(t, g);
        g.gridx = 0;
        g.gridy = 3;
        panel.add(b, g);
        g.gridx = 1;
        g.gridy = 1;
        panel.add(cb, g);
//        eleccion();
//        n_segundos();
//        n_semana();
//        nd_semana();
//        pack();
//   d_año();

        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (!t.getText().isEmpty()) {
      
 eleccion();
 v2.setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(null, "Inserte texto para empezar a jugar");
                }
//                v2.setVisible(true);
            }
        });

    }

    public void eleccion() {

        if ("Numero de semana del año".equals(cb.getSelectedItem())) {
            n_semana();
        }
        if ("Dia del año".equals(cb.getSelectedItem())) {
            d_año();
        }
        if ("Numero de segundos".equals(cb.getSelectedItem())) {
            n_segundos();
        }
        if ("Numero del dia de la semana ".equals(cb.getSelectedItem())) {
            nd_semana();
        }
    }

    public void n_semana() {
int n = Integer.parseInt(t.getText());
 Calendar c = Calendar.getInstance();
               int ca=c.get(Calendar.WEEK_OF_YEAR);
        if (n == ca) {
            v2.lr.setText("CORRECTO");
            v2.lr.setForeground(Color.green);
            v2.br.setText("TERMINAR");

        } else {
             v2.lr.setText("INCORRECTO");
             v2.lr.setForeground(Color.red);
            v2.br.setText("INTENTAR DE NUEVO");
        }
    }

    public void d_año() {
int n = Integer.parseInt(t.getText());
 Calendar c = Calendar.getInstance();
               int ca=c.get(Calendar.DAY_OF_YEAR);
        if (n == ca) {
          v2.lr.setText("CORRECTO");
            v2.lr.setForeground(Color.green);
            v2.br.setText("TERMINAR");

        } else {
              v2.lr.setText("INCORRECTO");
             v2.lr.setForeground(Color.red);
            v2.br.setText("INTENTAR DE NUEVO");
        }
    }

    public void n_segundos() {
int n = Integer.parseInt(t.getText());
 Calendar c = Calendar.getInstance();
               int ca=c.get(Calendar.SECOND);

        if (n == ca) {
           v2.lr.setText("CORRECTO");
            v2.lr.setForeground(Color.green);
            v2.br.setText("TERMINAR");

        } else {
             v2.lr.setText("INCORRECTO");
             v2.lr.setForeground(Color.red);
            v2.br.setText("INTENTAR DE NUEVO");
        }
    }

    public void nd_semana() {
int n = Integer.parseInt(t.getText());
 Calendar c = Calendar.getInstance();
               int ca=c.get(Calendar.DAY_OF_WEEK);
        if (n == ca) {
           v2.lr.setText("CORRECTO");
            v2.lr.setForeground(Color.green);
            v2.br.setText("TERMINAR");

        } else {
              v2.lr.setText("INCORRECTO");
             v2.lr.setForeground(Color.red);
            v2.br.setText("INTENTAR DE NUEVO");
        }
    }

        
            
            
    }


