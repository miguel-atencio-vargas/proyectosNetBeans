
package newpackage;

import java.sql.*;
import java.util.Scanner;


public class conect {
//http://acodigo.blogspot.com/2013/07/conectar-java-con-sql.html
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            String connectionUrl = "jdbc:sqlserver://;database=escuela;integratedSecurity=true;";
            Connection conect = DriverManager.getConnection(connectionUrl);
            System.out.println("Conectado.");
            insertData(conect);

            ejecutarConsulta(conect);
            ejecutarConsultaParametros(conect);

        } catch (SQLException ex) {
            System.out.println("Error.");
        }

    }

    /*Realizar consultas al conectar java con sql

Para realizar una consulta sql con java podemos usar el método executeQuery de la clase Statement la cual nos devolverá un ResultSet, que contiene los datos solicitados. Para ello, primero debe crear un objeto de la clase Statement mediante el método createStatement de la clase Connection.

Una vez tengamos los datos deseados en el ResultSet podemos verlos recorriendo este objeto mediante un loop while, llamando al método next nos devuelve la siguiente fila, con el método getString(“columna”), obtenemos el dato de una columna en específico “columna” es el nombre de la columna que deseamos obtener.*/
    public static void ejecutarConsulta(Connection con) {
        try {
            String SQL = "SELECT * FROM alumno";
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(SQL);

            while (rs.next()) {
                System.out.println(rs.getString("mat_alu") + " - " + rs.getString("nom_alu") + ", " + rs.getString("edad_alu"));
                //int ultima_mat_alu= Integer.valueOf(rs.getString("mat_alu"));
                //System.out.println(ultima_mat_alu);
            }
            rs.close();
            stmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
// Este metodo sirve para delimitar los datos de la consulta con el where

    /*En caso de que nuestra consulta requiera de parámetros, por ejemplo nuestra aplicación le pide al usuario un nombre y ese nombre lo buscara en la base de datos y lo mostrara, el nombre que ingrese el usuario será nuestro parámetro y lo representaremos en la consulta con el signo ?, para utilizarlo debemos obtener un objeto PreparedStatement, con el método setString(1, “nombre”) diremos que el primer parámetro tendrá el valor nombre, si tuviéramos 2 parámetros y quisiéramos establecer el segundo solo habría que indicar el número 2 y el valor. */
    public static void ejecutarConsultaParametros(Connection con) {
        try {
            String SQL = "SELECT * FROM alumno WHERE nom_alu=?";
            PreparedStatement pstmt = con.prepareStatement(SQL);
            pstmt.setString(1, "sergio");
            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                System.out.println(rs.getString("nom_alu") + ", " + rs.getString("edad_alu"));
            }
            rs.close();
            pstmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /*Actualizar datos mediante java y sql

Podemos actualizar datos existentes en una base de datos mediante el método executeUpdate de la clase Statement, este método nos devuelve un entero que indica el número de filas actualizadas.

Para actualizar datos podemos utilizar instrucciones como INSERT, UPDATE, DELETE.

String SQL = "INSERT INTO tabla (Col2, Col3) VALUES ('1', 2)";
Statement stmt = con.createStatement();
int count = stmt.executeUpdate(SQL);
System.out.println("filas afectadas: " + count);
stmt.close();*/
    public static void insertData(Connection con) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Ingrese los datos del alumno en el siguiente orden");
            System.out.println("Matricula(Unica) - Nombre - Edad - Semestre - Sexo - Carrera (Int)");
            int mat=sc.nextInt(); String name=sc.next(); int age=sc.nextInt(), sem=sc.nextInt(); String sex=sc.next(); int carr=sc.nextInt();
           ;
            String SQL = "INSERT INTO alumno values ("+mat+", '"+name+"', "+age+", "+sem+", '"+sex+"', "+carr+")";
            Statement stmt = con.createStatement();
            int count = stmt.executeUpdate(SQL);
            System.out.println("Filas afectadas: " + count);
            stmt.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
