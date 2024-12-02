/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crear;

import java.io.File;

/**
 *
 * @author carlo
 */
public class crearDir implements crearInterfaz{

    
    /**
     * Funcion para crear un directorio en la ruta indicada y con el 
     * nombre introducido(devuelve el resultado de la operacion)
     * @param name nombre del directorio
     * @param path ruta donde crearlo
     * @return estado de la accion
     */
    @Override
    public boolean crearDirectorio(String name, String path) {
            File f = new File(path+"/"+name);
            return f.mkdir();
    }
    
}
