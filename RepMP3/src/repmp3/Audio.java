/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repmp3;

/**
 *
 * @author Rusty
 */
public class Audio {
    private int id;
    private String nombre;
    private String artista;
    private int año;
    private String album;
    private int duracion;
    private String ruta;

    //Constructor
    public Audio(int id, String nombre, String artista, int año, String album, int duracion, String ruta) {
        this.id = id;
        this.nombre = nombre;
        this.artista = artista;
        this.año = año;
        this.album = album;
        this.duracion = duracion;
        this.ruta = ruta;
    }



    // Getters y Setters
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getArtista() {
        return artista;
    }
    
    public int getAño() {
        return año;
    }

    public String getAlbum() {
        return album;
    }

    public int getDuracion() {
        return duracion;
    }
    
    public String getRuta() {
        return ruta;
    }
}
