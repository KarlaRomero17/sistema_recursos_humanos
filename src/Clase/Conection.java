/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clase;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Lissette
 */
public class Conection {
    private Connection con;
    String user = "root";
    String password = "";
    String db = "sistema_rrhh_test"; // Nombre de la base de datos
    String ip = "localhost";
    String port = "3306";

    String cadena = "jdbc:mysql://" + ip + ":" + port + "/" + db;
    public Conection() {
        con = null; // Inicializa la conexión como nula en el constructor
    }

    public Connection getCon() {
        return con;
    }

    public void setCon(Connection con) {
        this.con = con;
    }
    public void conectar() throws Exception{
        try {
            // Debes cargar el controlador JDBC correctamente
            Class.forName("com.mysql.cj.jdbc.Driver");
            //con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sistema_rrhh?user=root&password=''");
            con =  DriverManager.getConnection(cadena, user, password);
            //JOptionPane.showMessageDialog(null, "Se conectó correctamente a la base de datos AAAA");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se pudo conectar a la base de datos: Error " + e.toString());
        }
        //return conectar;
    }
    public void desconectar() throws Exception{
        try {
            if(con.isClosed() == false){
                con.close();
            }
        } catch (Exception e) {
            throw e;
        }
    }


    
    
    
}
