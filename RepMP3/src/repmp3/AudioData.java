/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repmp3;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Class AudioData para manejar las operaciones de la base de datos.
 * @author Rusty
 */

public class AudioData {
    
    // Para loguear las Excepciones    
    private static final Logger LOGGER = Logger.getLogger(AudioData.class.getName());
        
    //Se obtiene todos los datos de audio de la Base de Datos 
    public List<Audio> getAllAudios() {
        List<Audio> audios = new ArrayList<>();
            String query = "SELECT * FROM himnos"; 
            try(Connection conexion = Conexion.obtenerConexion();      
            PreparedStatement ps = conexion.prepareStatement(query);
            ResultSet rs = ps.executeQuery()) { 

            while (rs.next()) {
                int id = rs.getInt("id");
                String nombre = rs.getString("nombre");
                String artista = rs.getString("artista");
                int año = rs.getInt("año");
                String album = rs.getString("album");
                int duracion = rs.getInt("duracion");
                String ruta = rs.getString("ruta");
                //Crea objetos Audio para cada registro. 
                Audio audio = new Audio(id, nombre, artista, año, album, duracion, ruta);
                audios.add(audio); 
                //Agrega los objetos Audio a una lista y devuelve la lista "audios". 
            }
            
        } catch (SQLException e) {
            LOGGER.log(Level.SEVERE, "Error al obtener datos de audio", e);
            JOptionPane.showMessageDialog(null, "Error al obtener datos de audio");
        }
        return audios;        
    }
    
    //Método getRutaByNombre para obtener la ruta de un archivo de audio basado en su nombre.
    public String getRutaByNombre(String nombre) {
        String ruta = null;
        String query = "SELECT ruta FROM himnos WHERE nombre = ?";
        try (Connection conexion = Conexion.obtenerConexion();
             PreparedStatement ps = conexion.prepareStatement(query)) {
            ps.setString(1, nombre);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    ruta = rs.getString("ruta");
                }
            }
        } catch (SQLException e) {
            LOGGER.log(Level.SEVERE, "Error al obtener la ruta del audio", e);
        }
        return ruta;
    }
    
        
    //Método populateTable para llenar la JTable con los datos obtenidos de la base de datos.
    //Itera sobre la lista audios y agregar cada audio como una fila en la tabla.
    public void populateTable(DefaultTableModel tableModel) {
        List<Audio> audios = getAllAudios();
        for (Audio audio : audios) {
            tableModel.addRow(new Object[]{
                audio.getNombre(), 
                audio.getArtista(), 
                audio.getAño(), 
                audio.getAlbum(), 
                audio.getDuracion()
            });
        }
    }
        
}
