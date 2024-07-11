/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repmp3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Rusty
 */
public class Conexion {
    
    private static final String URL="jdbc:mysql://localhost:3306/mp3audios";
    private static final String USER="root";
    private static final String PASSWORD="";

        
    public static Connection obtenerConexion(){
        Connection conexion=null;
        try{
            conexion = DriverManager.getConnection(URL, USER, PASSWORD);
	    if (conexion != null) {
            System.out.println("Conexión a la DDBB satisfactoria");
			}
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al conectarse a la DDBB. "
                    + "Verifique: usuario, password o el nombre de la BBDD que intenta conectar. "+ ex.getMessage());
        }
        return conexion;
    }
             
}
