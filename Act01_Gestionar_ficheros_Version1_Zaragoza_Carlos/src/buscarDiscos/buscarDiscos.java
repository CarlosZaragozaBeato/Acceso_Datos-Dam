/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buscarDiscos;

import java.io.File;
import java.util.ArrayList;

/**
 *
 * @author usumaniana
 */
public class buscarDiscos implements buscarDiscosInterface {

    /**
     * Clases para buscar los discos
     */
    public buscarDiscos() {}

    /**
     * Busca los discos y los devuelve en una lista
     * @return   Devuelve una lista de los discos que tenemos en el ordenador
     */
    @Override
    public ArrayList<File> getUnidades() {
        ArrayList<File> almacenDiscos = new ArrayList<File>();
        try {
            File[] unidades = File.listRoots(); 
            for (File f : unidades) {
               
                almacenDiscos.add(f);
            }
        } catch (Exception ex) {System.out.println(ex.getMessage());}
        return almacenDiscos;
    }
    
}
