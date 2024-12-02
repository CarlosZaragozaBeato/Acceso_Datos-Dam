/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package filtrarFicheros;

import java.io.File;
import java.util.ArrayList;

/**
 *
 * @author carlo
 */
public class filtrarFicheros implements filtrarFicherosInterfaz {

    
    /*

    */
    /**
     * Funcion para filtrar nuestros ficheros que filtra segun la extension
     * que le pasemos por parametros
     * @param ext extension a filtrar
     * @param lista lista sin filtrar
     * @return lista filtrada
     */
    @Override
    public ArrayList<File> filtrarFicherosExt(String ext, ArrayList<File> lista) {

        ArrayList listaFiltrada = new ArrayList();
     
        for(File f: lista){
         if(f.getName().endsWith(ext)){
                listaFiltrada.add(f);
         } 
        }
        return listaFiltrada;
    }

    


    


 
    
}
