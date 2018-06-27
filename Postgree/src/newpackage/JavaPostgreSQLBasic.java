package newpackage;

import java.sql.*;
import java.util.Scanner;
/*
import java.util.logging.Level;
import java.util.logging.Logger;*/

public class JavaPostgreSQLBasic {

    /**
     * Method to connect to the database by passing parameters. Método para
     * establecer la conexión a la base de datos mediante el paso de parámetros.
     *
     * @param host <code>String</code> host name or ip. Nombre del host o ip.
     * @param port <code>String</code> listening database port. Puerto en el que
     * escucha la base de datos.
     * @param database <code>String</code> database name for the connection.
     * Nombre de la base de datos para la conexión.
     * @param user <code>String</code> user name. Nombre de usuario.
     * @param password  <code>String</code> user password. Password del usuario.
     */
    /**
     * Probando la conexión en Java a PostgreSQL especificando el host y el
     * puerto.
     */
    public static void main(String[] args) {
        Connection connection = null;
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
            System.out.println(valid ? "Conexión establecida" : "Fallo al conectarse");
        } catch (java.sql.SQLException sqle) {
            System.out.println("Error al conectar con la base de datos de PostgreSQL (" + url + "): " + sqle);
        }
       // System.out.println(connection);
        insertData(connection);
        ejecutarConsulta(connection);
        
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
        public static void insertData(Connection con) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Ingrese los datos del producto en el siguiente orden");
            System.out.println("Clave del producto (Unica) - Tipo - Descripcion - Precio (Double)");
            int clav=sc.nextInt(); String tipo=sc.next(); String descrip=sc.next(); String prec=sc.next();
            double precio=Double.parseDouble(prec);
            String SQL = "INSERT INTO productos VALUES ("+clav+", '"+tipo+"', '"+descrip+"', "+precio+")";
            Statement stmt = con.createStatement();
            int count = stmt.executeUpdate(SQL);
            System.out.println("Filas afectadas: " + count);
            stmt.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
