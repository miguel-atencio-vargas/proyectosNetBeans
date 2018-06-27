/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicafinalfinal;

import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author atenc
 */
public class EncuestaForm extends JFrame implements ActionListener {

    private JRadioButton rbtn1, rbtn2, rbtn3;
    private JLabel label1, label2, label3, label4, label5, label6, label7, label8;
    private JCheckBox box1, box2, box3;

    public EncuestaForm() {
        setLayout(null);
        rbtn1 = new JRadioButton();
        rbtn1.setBounds(20, 40, 20, 20);
        add(rbtn1);
        //rbtn1.addActionListener(this);

        rbtn2 = new JRadioButton();
        rbtn2.setBounds(20, 60, 20, 20);
        add(rbtn2);
        //rbtn2.addActionListener(this);

        rbtn3 = new JRadioButton();
        rbtn3.setBounds(20, 80, 20, 20);
        add(rbtn3);
        //rbtn3.addActionListener(this);

        label1 = new JLabel("Universidad Loyola de Bolivia");
        label1.setBounds(40, 40, 200, 20);
        add(label1);

        label2 = new JLabel("EMI");
        label2.setBounds(40, 60, 200, 20);
        add(label2);

        label3 = new JLabel("Universidad Tarapaca");
        label3.setBounds(40, 80, 200, 20);
        add(label3);

        label4 = new JLabel("Seleccione una universidad:");
        label4.setBounds(20, 10, 200, 20);
        add(label4);

        label5 = new JLabel("Seleccione una carrera puede seleccionar ninguna o varias opciones");
        label5.setBounds(10, 120, 600, 30);
        add(label5);

        box1 = new JCheckBox();
        box1.setBounds(20, 160, 20, 20);
        add(box1);
        
        box2 = new JCheckBox();
        box2.setBounds(20, 180, 20, 20);
        add(box2);
        
        box3 = new JCheckBox();
        box3.setBounds(20, 200, 20, 20);
        add(box3);
        
        label5 = new JLabel("Ingenieria de Sistemas");
        label5.setBounds(40, 160, 200, 20);
        add(label5);
        
        label6 = new JLabel("Ingenieria Electrónica");
        label6.setBounds(40, 180, 200, 20);
        add(label6);
        
        label7 = new JLabel("Ingenieria Electromecanica");
        label7.setBounds(40, 200, 200, 20);
        add(label7);
    }
    @Override
    public void actionPerformed(ActionEvent e){
        // aqui debe ir el metodo para que se desselectciones las demas casillas
    }
    public static void main(String[] args) {
        EncuestaForm f1 = new EncuestaForm();
        f1.setVisible(true);
        f1.setLocationRelativeTo(null);
        f1.setBounds(500, 100, 500, 400);
        f1.setTitle("Encuesta Virtual");
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
