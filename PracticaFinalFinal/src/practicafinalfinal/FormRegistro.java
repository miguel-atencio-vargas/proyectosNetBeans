/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicafinalfinal;

import java.awt.event.*;
import javax.swing.JFrame;
import javax.swing.*;

/**
 *
 * @author atenc
 */
public class FormRegistro extends JFrame implements ActionListener {

    private JLabel label1, label2, label3;
    private JTextField tf1, tf2;
    private JButton btn1, btn2, btn3;
    public String name;
    public int age;

    public FormRegistro() {
        setLayout(null);

        label1 = new JLabel("Ingrese su nombre:");
        label1.setBounds(20, 20, 150, 20);
        add(label1);

        label2 = new JLabel("Ingrese su C.I.:");
        label2.setBounds(20, 60, 150, 20);
        add(label2);
        
        label3 = new JLabel("");
        label3.setBounds(130, 160, 150, 20);
        add(label3);

        tf1 = new JTextField();
        tf1.setBounds(180, 20, 150, 20);
        add(tf1);

        tf2 = new JTextField();
        tf2.setBounds(180, 60, 150, 20);
        add(tf2);
        
        btn1= new JButton("Guardar");
        btn1.setBounds(20,100, 100,30);
        add(btn1);
        btn1.addActionListener(this);
        
        btn2= new JButton("Mostrar");
        btn2.setBounds(130,100, 100,30);
        add(btn2);
        btn2.addActionListener(this);
        
        btn3= new JButton("Cerrar");
        btn3.setBounds(240,100, 100,30);
        add(btn3);
        btn3.addActionListener(this);

    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==btn1){
            name=tf1.getText();
            age= Integer.parseInt(tf2.getText());
            tf1.setText(" ");
            tf2.setText(" ");
        }
        if(e.getSource()==btn2){
            label3.setText(name+"  "+age);
        }
        if(e.getSource()==btn3){
            //aqui debe ir el metodo para cerrar el jframe
        }
        
    }

    public static void main(String[] args) {
        FormRegistro f1 = new FormRegistro();
        f1.setVisible(true);
        f1.setLocationRelativeTo(null);
        f1.setBounds(500, 100, 400, 300);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
