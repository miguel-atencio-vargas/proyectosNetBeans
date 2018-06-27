
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicafinalfinal;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author atenc
 */
public class FormJuanita extends JFrame implements ActionListener{
//
    
    private JLabel label1;
    private JButton btn1;
    private JTextField tf1;
    
    public FormJuanita(){
        setLayout(null);
        
        label1= new JLabel("Hola");
        label1.setBounds(180, 20, 100,30);
        add(label1);
        
        tf1= new JTextField();
        tf1.setBounds(140,80,100,30);
        add(tf1);
        
        btn1= new JButton("Enviar");
        btn1.setBounds(140,110,100,30);
        add(btn1);
        btn1.addActionListener(this);
    } 
    @Override
    public void actionPerformed(ActionEvent e){
      if(e.getSource()==btn1){
          label1.setText("Hola "+tf1.getText());
          
      }  
    }
    
    public static void main(String[] args)  {
       FormJuanita f1 = new FormJuanita();
        f1.setVisible(true);
        f1.setLocationRelativeTo(null);
        f1.setBounds(100, 100, 400, 400);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
