/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clasefile.model.es_teclado;

import java.util.Scanner;

/**
 *
 * @author usumaniana
 */
public class ESTeclado implements eSTeclado_interface{

    @Override
    public String leerTeclado() {
        Scanner entrada = new Scanner(System.in);
        
        String mensaje = entrada.nextLine();
        
        entrada.close();
        return mensaje;
    }

    

    
}
