/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicafinalfinal;

import java.awt.Color;
import java.awt.event.*;

import javax.swing.*;

/**
 *
 * @author atenc
 */
public class Colors extends JFrame implements ActionListener{

    private JTextArea a;
    private JRadioButton rbtn1, rbtn2, rbtn3;
    private JLabel label1, label2, label3;

    public Colors() {
        setLayout(null);
        rbtn1 = new JRadioButton();
        rbtn1.setBounds(20, 20, 20, 20);
        add(rbtn1);
        rbtn1.addActionListener(this);
        
        rbtn2 = new JRadioButton();
        rbtn2.setBounds(20, 40, 20, 20);
        add(rbtn2);
        rbtn2.addActionListener(this);

        rbtn3 = new JRadioButton();
        rbtn3.setBounds(20, 60, 20, 20);
        add(rbtn3);
        rbtn3.addActionListener(this);

        label1 = new JLabel("RED");
        label1.setBounds(40, 20, 40, 20);
        add(label1);
        

        label2 = new JLabel("BLUE");
        label2.setBounds(40, 40, 40, 20);
        add(label2);

        label3 = new JLabel("YELLOW");
        label3.setBounds(40, 60, 60, 20);
        add(label3);
        
        a= new JTextArea("");
        a.setBounds(30, 80, 80,80);
        add(a);

    }
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==rbtn1){
            a.setBackground(new java.awt.Color(255, 0, 0));
           
        }
        if(e.getSource()==rbtn2){
            a.setBackground(new java.awt.Color(127, 159, 209));
        }
        if(e.getSource()==rbtn3){
            a.setBackground(new java.awt.Color(255, 255, 0));
        }
    }

    public static void main(String[] args) {
        Colors f1 = new Colors();
        f1.setVisible(true);
        f1.setLocationRelativeTo(null);
        f1.setBounds(100, 100, 400, 400);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
