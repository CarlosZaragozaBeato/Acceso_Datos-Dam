/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package filtrarFicheros;

import java.io.File;
import java.util.ArrayList;

/**
 *
 * @author carlo
 */
public interface filtrarFicherosInterfaz {
    
    /**
     * 
     * @param ext extension
     * @param lista lista para filtrar
     * @return listra filtrada
     */
    public ArrayList<File> filtrarFicherosExt(String ext, ArrayList<File> lista);
    
}
