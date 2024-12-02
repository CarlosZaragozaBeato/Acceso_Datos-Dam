/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

/**
 *
 * @author usumaniana
 */
public class utils {
    

    /**
     *Function para extraer la extension de la lista de nuestros ficheros 
     *para enseñarlo en la tabla
     * @return devuelve un string
     * @param cadena cadena texto
    */
    public String dividirExtension(String cadena){
        
        String extension = "";
        
        for(int i = cadena.length()-1; i>0; i--){
            if(cadena.charAt(i) == '.' ){
               extension = cadena.substring(i, cadena.length());
               break;
            }
        }
        return extension;
    }
}
