/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.clasefile.model.g_ficheros;

import com.mycompany.clasefile.model.Discos;
import java.awt.List;
import java.io.File;
import java.util.ArrayList;

/**
 *
 * @author usumaniana
 */
public interface interfaceGFicheros {
   
    /*public ArrayList<File> getFicheros(String pathDir,String ext);

    public ArrayList<File> getFicheros();
    
    public ArrayList<File> getFicheros(String pathDir);*/
    
    public ArrayList<File> getDir(String pathDir);
    
    public ArrayList<File> getDir();
    
    /*
    public boolean nuevoDirectorio(String pathDir, String nuevoDir);
    
    public boolean eliminarFichero(String pathDir, String nombreFichero);

    public boolean eliminarDir(String pathDir, boolean siForzar);*/
    
    public ArrayList<Discos> getUnidades();
}


