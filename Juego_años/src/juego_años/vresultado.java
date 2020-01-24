
package juego_años;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class vresultado extends JFrame{
      JLabel lr = new JLabel();
        
        JButton br = new JButton("");
     
        JPanel panel2 = new JPanel(new GridBagLayout());
        GridBagConstraints gr= new GridBagConstraints();
    
    public vresultado() {
         super("Juego");
        setSize(500, 300);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        this.setVisible(true);
  add_comp();

lr.setVisible(true);

br.setVisible(true);
}
    public void add_comp (){
        this.getContentPane().add(panel2);
        gr.gridx=0;
        gr.gridy = 0;
       panel2.add(lr);
        gr.gridx=0;
       gr.gridy = 1;
       panel2.add(br);
//        gr.gridx=3;
//       gr.gridy=2;
//       panel2.add(lr2);
       br.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
               dispose();
            }
        });
     
        
        
    
    }
    
}
