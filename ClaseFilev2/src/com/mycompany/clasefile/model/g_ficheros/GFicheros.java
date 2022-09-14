/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clasefile.model.g_ficheros;

import com.mycompany.clasefile.model.Discos;
import com.mycompany.clasefile.model.g_ficheros.interfaceGFicheros;
import java.io.File;
import java.util.ArrayList;

/**
 *
 * @author usumaniana
 */
public class GFicheros implements interfaceGFicheros{


  

 

    @Override
    public ArrayList<File> getDir(String pathDir) {
        
        
        ArrayList lista = new ArrayList();
        File f = new File(pathDir);
        
        for(int i = 0; i<f.listFiles().length; i++){
            lista.add(f.listFiles()[i]); 
        }
     
        return lista;
    }
    
    @Override
    public ArrayList<File> getDir() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    /*@Override
    public ArrayList<File> getDir(String pathDir) {
    }

    @Override
    public ArrayList<File> getDir() {
    }

    @Override
    public boolean nuevoDirectorio(String pathDir, String nuevoDir) {
    }

    @Override
    public boolean eliminarFichero(String pathDir, String nombreFichero) {
    }

    @Override
    public boolean eliminarDir(String pathDir, boolean siForzar) {
    }*/

    @Override
    public ArrayList<Discos> getUnidades() {
         ArrayList<Discos> almacenDiscos = new ArrayList<Discos>();
        
           try{
            File [] unidades = File.listRoots();
            Discos d;
   
            for(File f : unidades){
             d = new Discos(f.toString(), f.getTotalSpace(), 
                     (f.getTotalSpace()-f.getFreeSpace()),
                      f.getFreeSpace());
             
             almacenDiscos.add(d);   
             
        }
      }catch(Exception ex){
          System.out.println(ex.getMessage());
      } 
           return almacenDiscos;
    }


}
