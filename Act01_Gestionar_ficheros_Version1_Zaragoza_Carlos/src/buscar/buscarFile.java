/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buscar;

import java.io.File;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author usumaniana
 */
public class buscarFile implements buscarFileInterface{

    
    public buscarFile() {}

    /**
     * Esta funcion devuelve todos los archivos file que no sean directorios
     * @param pathDir ruta donde buscar los directorios
     * @return devuelve la lista de ficheros de la ruta especificada
     */
    @Override
    public ArrayList<File> buscarFicheros(String pathDir) {
        ArrayList lista = new ArrayList();
        try {
            File f = new File(pathDir);
            for (int i = 0; i < f.listFiles().length; i++) {
                if (!f.listFiles()[i].isDirectory()) {
                    lista.add(f.listFiles()[i]);
                }
            }
        } catch (NullPointerException e) {
                    JOptionPane.showMessageDialog(null, "Por favor indique una ruta existente",
                "Error", JOptionPane.ERROR_MESSAGE);
        }
        return lista;
    }

    /**
     *  Al contrario del metodo anterios este devuelve todos los directorios de la lista
     * @param ruta ruta para buscar los directorios
     * @return devuelve una lista de directorios
     */
    @Override
    public ArrayList<File> buscarDirectorios(String ruta) {
        ArrayList lista = new ArrayList();
        File f = new File(ruta);
        try{
             for (int i = 0; i < f.listFiles().length; i++) {       
                if(f.listFiles()[i].isDirectory()){
                      lista.add(f.listFiles()[i]); 
                }
        }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return lista;
    }
}
