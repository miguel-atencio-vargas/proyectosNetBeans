/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicafinalfinal;


import java.awt.event.*;
import java.sql.*;
import java.util.Scanner;

import javax.swing.*;



/**
 *
 * @author atenc
 */
public class BaseDeDatos extends JFrame implements ActionListener{
    
       private static JTextField tf1, tf2, tf3, tf4, tf5;
    public JLabel label1, label2, label3, label4, label5, label6;
    private JButton btn1, btn2, btn3;
    
        public BaseDeDatos() {
        setLayout(null);

        label1 = new JLabel("Registre un nuevo usuario la base de datos");
        label1.setBounds(10, 10, 600, 20);
        add(label1);

        label2 = new JLabel("cod (Único)");
        label2.setBounds(150, 60, 100, 20);
        add(label2);

        label3 = new JLabel("Nombre");
        label3.setBounds(150, 90, 100, 20);
        add(label3);

        label4 = new JLabel("Apellido");
        label4.setBounds(150, 120, 100, 20);
        add(label4);

        label5 = new JLabel("Estado Civil");
        label5.setBounds(150, 150, 100, 20);
        add(label5);
        
        label6 = new JLabel("Edad");
        label6.setBounds(150, 180, 100, 20);
        add(label6);

        tf1 = new JTextField();
        tf1.setBounds(15, 60, 100, 20);
        add(tf1);

        tf2 = new JTextField();
        tf2.setBounds(15, 90, 100, 20);
        add(tf2);

        tf3 = new JTextField();
        tf3.setBounds(15, 120, 100, 20);
        add(tf3);

        tf4 = new JTextField();
        tf4.setBounds(15, 150, 100, 20);
        add(tf4);
        
        tf5 = new JTextField();
        tf5.setBounds(15, 180, 100, 20);
        add(tf5);

        btn1 = new JButton("Conectar");
        btn1.setBounds(15, 210, 90, 20);
        add(btn1);
        btn1.addActionListener(this);

        btn2 = new JButton("Guardar");
        btn2.setBounds(110, 210, 80, 20);
        add(btn2);
        btn2.addActionListener(this);

        btn3 = new JButton("Cerrar");
        btn3.setBounds(200, 210, 80, 20);
        add(btn3);
        btn3.addActionListener(this);
    }

        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource()==btn1){
                f=true;
                boolean v=conectarDB();
                label1.setText(v ? "Conexion establecida" : "Fallo al conectarse con la DB");
            }
            
            if(e.getSource()==btn2 && f==true){
                label1.setText("Se ha registrado un nuevo usuario");
                insertDB(conect);
            }
            if(f==false){
                label1.setText("Porfavor primero conectese a la base de datos");
            }
            if(e.getSource()==btn3){
               this.dispose();
            }
            
        }
    
    public static void insertDB(Connection con) {
        Scanner sc = new Scanner(System.in);
        try {
            Statement stmt = con.createStatement();
            int cod = Integer.parseInt(tf1.getText());
            String nombre = tf2.getText();
            String apellido = tf3.getText();
            String civil = tf4.getText();
            int age = Integer.parseInt(tf5.getText());
            String SQL = "INSERT INTO registro VALUES (" + cod + ", '" + nombre + "', '" + apellido + "', '" + civil + "', " + age + ");";
            stmt.executeUpdate(SQL);
            stmt.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static Connection conect = null;
    public static boolean f=false,d=false;
    public  boolean conectarDB() {
        String url = "jdbc:postgresql://localhost:5000/postgres";

        try {
            conect = DriverManager.getConnection(url, "admin", "admin");
            boolean valid = conect.isValid(50000);
            return valid;
        } catch (java.sql.SQLException sql) {
            System.out.println("Error al conectarse con la base de datos de PostgreSQL");
        }
        return false;
    }
    
        public static void main(String[] args) {
        BaseDeDatos f1 = new BaseDeDatos();
        f1.setVisible(true);
        f1.setLocationRelativeTo(null);
        f1.setBounds(500, 100, 300, 400);
        f1.setTitle("Registro");
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
