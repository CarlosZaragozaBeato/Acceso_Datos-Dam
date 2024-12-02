/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crear;

/**
 *
 * @author carlo
 */
interface crearInterfaz {
    /**
     * 
     * @param name nombre del diretorio a crear
     * @param path ruta donde crear el directorio
     * @return estado de la accion
     */
    public boolean crearDirectorio(String name, String path);
}
