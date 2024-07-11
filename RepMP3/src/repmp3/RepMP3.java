/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package repmp3;

//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import javazoom.jl.decoder.JavaLayerException;
//import javazoom.jl.player.Player;

/**
 * Reproductor de audio en formato MP3 utilizando JLayer.
 * @author Rusty
 */
public class RepMP3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
           
    {
    
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vista().setVisible(true);
            }
        });


    }
          
            
/*
EJEMPLO de prueba:
    _Descometar los import.
    _Cometar el codigo de arriba que ejecuta la vista.
    _Descometar el codigo de abajo y ejecutar para comprobar que funciona el reproductor.
*/
//            throws FileNotFoundException,
//         JavaLayerException 
//    {
//        Player tema = new Player(new FileInputStream(
//        "D:\\Trayecto_JAVA\\JAVA_Tecno_3F\\tema.mp3"));
//      tema.play();
//       
//    }          
//    
            
            
            
            
            
}
