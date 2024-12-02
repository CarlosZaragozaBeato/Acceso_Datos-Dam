/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eliminarDirectorio;

import java.io.File;
import javax.swing.JOptionPane;

/**
 *
 * @author carlo
 */
public class eliminarDirectorio implements eliminarDirectorioInterfaz {

    /**
     * En este metodo primero comprobamos si en la ruta que indica el usuario se
     * ecuentra algun directorio, si encontramos algun directorio cancelamos la
     * operacion del metodo,(ya que no podemos eliminar subcarpetas), si no
     * encuentra ninguna directorio pero encuentra algun archivo cambiamos el
     * valor de las variables condition y contieneFicheros a true. si por ejemplo
     * dicha carpeta no tiene ningun fichero/directorio eliminaremos todo el
     * contenido sin preguntar.
     *
     * @param path PAsamos la ruta para eliminar el directorio
     */
    @Override
    public void eliminarDir(String path) {
        File ficheros = new File(path);
            int dialogButton = JOptionPane.NO_OPTION;
        boolean condition = true;
        boolean contieneFicheros = false;

        // Compruebo si la carpeta esta vacia
        if (ficheros.listFiles().length > 0) {
            for (File f : ficheros.listFiles()) {
                if (f.isDirectory()) {
                    condition = false;
                    JOptionPane.showMessageDialog(null, "No puede eliminar el directorio si contiene subdirectorios!",
                            "Error!", JOptionPane.ERROR_MESSAGE);
                    break;
                } else {
                    condition = true;
                    contieneFicheros = true;
                }
            }
        } else {
            condition = true;
        }
        ComprobarFicheros(condition, contieneFicheros, dialogButton, ficheros);
    }

    /**
     * En este metodo comprobamos si nuestra carpeta tiene algun fichero dentro,
     * y preguntamos al usuario si deseamos eliminarlo, si no tiene ficheros se
     * eliminara sin preguntar si le indicamos que deseamos eliminar todos los
     * ficheros, tendremos que ir eliminandolos uno a uno con un bucle
     * subcarpetas y poder cancelar la operacion si se encuentran en ella
     *
     * @param condition condition de la operation
     * @param contieneFicheros tiene o no ficheros
     * @param dialogButton dialogo options
     * @param ficheros fichero a eliminar
     */
    
    @Override
    public void ComprobarFicheros(boolean condition,
            boolean contieneFicheros,
            int dialogButton,
            File ficheros) {

        if (condition) {
            if (contieneFicheros) {
                dialogButton = JOptionPane.showConfirmDialog(null,
                        "Estas seguro de eliminar los ficheros", "Eliminar",
                        JOptionPane.YES_NO_OPTION);
                if (dialogButton == JOptionPane.YES_OPTION) {
                    eliminarSubDirectorios(ficheros);
                }
            } else {
                ficheros.delete();
            }
        }
    }

    /**
     * Elimina las subcarpetas del fichero indicado
     * 
     * @param ficheros 
     */
   
    @Override
    public void eliminarSubDirectorios(File ficheros) {
        for (File fi : ficheros.listFiles()) {
            fi.delete();
        }
        ficheros.delete();
    }
}
