/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package buscar;

import java.io.File;
import java.util.ArrayList;

/**
 *
 * @author usumaniana
 */
public interface buscarFileInterface {
    
    /**
    * busca los ficheros 
    * @param ruta ruta para buscar
    * @return devuelve lista de files
    */  
    public ArrayList<File> buscarFicheros(String ruta);
    
    /**
    * busca los directorios
    *@param pathDir ruta para buscar
    *@return devuelve lista de files
    */
    public ArrayList<File> buscarDirectorios(String pathDir);
    
    
}
