package newpackage;

import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.*;

public class PanelCodigo extends JFrame implements ActionListener {

    private JButton btn1, btn2;
    public static JLabel label1, label2, label3;
    private JTextField tf1, tf2;
    private static JTextArea a1;

public static Connection connection = null;
    public PanelCodigo() {
        setLayout(null);
        
        
        btn1 = new JButton("Insertar");
        btn1.setBounds(250, 100, 120, 30);
        add(btn1);
        btn1.addActionListener(this);

        btn2 = new JButton("Consultar DB");
        btn2.setBounds(250, 200, 120, 30);
        add(btn2);
        btn2.addActionListener(this);

        

        label1 = new JLabel("Ingrese su nombre");
        label1.setBounds(10, 20, 300, 30);
        add(label1);
        
        label2 = new JLabel("Ingrese su edad");
        label2.setBounds(10, 100, 300, 30);
        add(label2);
        
        label3= new JLabel ("");
        label3.setBounds(100, 400, 300, 30);
        add(label3);
        
        tf1= new JTextField("");
        tf1.setBounds(10,60, 200,30);
        add(tf1);
        
        tf2= new JTextField("");
        tf2.setBounds(10,130, 200,30);
        add(tf2);
        
        a1= new JTextArea("");
        a1.setBounds(10, 200, 200,200);
        add(a1);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btn1) {
            String name=tf1.getText();
            int  age=Integer.parseInt(tf2.getText()) ;
            ejecutarConsulta(connection);
            
            
        }
        if (e.getSource() == btn2) {
            
        }
      

    }

    public static void main(String[] args) {
        PanelCodigo f1 = new PanelCodigo();
        f1.setVisible(true);
        f1.setLocationRelativeTo(null);
        f1.setBounds(100, 100, 400, 500);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
         
        
        
        String url = "jdbc:postgresql://localhost:5000/postgres";
        try {
            // Registramos el driver de PostgresSQL
            try {
                Class.forName("org.postgresql.Driver");
            } catch (ClassNotFoundException ex) {
                System.out.println("Error al registrar el driver de PostgreSQL: " + ex);
            }
            // Conectamos con la base de datos
            connection = DriverManager.getConnection(url,"admin","admin");
            boolean valid = connection.isValid(50000);
            if(valid){
                label3.setText("Conexion establecida");
            }
        } catch (java.sql.SQLException sqle) {
            System.out.println("Error al conectar con la base de datos de PostgreSQL (" + url + "): " + sqle);
        }
    }
        public static void ejecutarConsulta(Connection con) {
        try {
            Statement stmt = con.createStatement();
            String SQL = "SELECT * FROM productos;";

            ResultSet rs = stmt.executeQuery(SQL);
          
            while (rs.next()) {
                System.out.println(rs.getString("tipo") + " - " + rs.getString("descrip")+" - "+rs.getString("precio"));
            }
            rs.close();
            stmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


