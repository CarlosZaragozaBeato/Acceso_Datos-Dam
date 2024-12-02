/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package eliminarDirectorio;

import java.io.File;

/**
 *
 * @author carlo
 */
public interface eliminarDirectorioInterfaz {

    /**
     * elimina el directorio
     *
     * @param path ruta del archivo a eliminar
     */
    public void eliminarDir(String path);

    /**
     *
     * @param condition
     * @param contieneFicheros
     * @param dialogButton
     * @param ficheros
     */
    public void ComprobarFicheros(boolean condition,
            boolean contieneFicheros,
            int dialogButton,
            File ficheros);

    /**
     * 
     * @param ficheros 
     */
    public void eliminarSubDirectorios(File ficheros);
}
