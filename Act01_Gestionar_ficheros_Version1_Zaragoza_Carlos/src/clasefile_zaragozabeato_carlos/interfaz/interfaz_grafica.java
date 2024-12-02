/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package clasefile_zaragozabeato_carlos.interfaz;

import buscar.buscarFile;
import buscarDiscos.buscarDiscos;
import crear.crearDir;
import eliminarDirectorio.eliminarDirectorio;
import filtrarFicheros.filtrarFicheros;
import java.awt.event.MouseEvent;
import java.io.File;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import utils.utils;

/**
 *
 * @author usumaniana
 */
public class interfaz_grafica extends javax.swing.JFrame {

    /**
     * Creates new form interfaz_grafica
     */
    //** Tablas / Listas
    /**
     * Datos tabla discos
     */
    private String[] datosDiscos = {"Unidad", "Ocupado", "Libre", "Total"};
    /**
     * Objeto tabla discos
     */
    Object[][] dataDiscos = new Object[0][0];

    /**
     * model discos
     */
    DefaultTableModel dftDiscos = new DefaultTableModel(dataDiscos, datosDiscos);

    /**
     * datos tabla ficheros
     */
    private String[] datosFicheros = {"Nombre",
         "CRead",
         "CWrite",
         "CExecute",
         "Extension",
         "Size"};
    /**
     * *Objeto ficheros
     */
    Object[][] dataFicheros = new Object[0][0];
    /**
     * model ficheros
     */
    private DefaultTableModel dftFicheros = new DefaultTableModel(dataFicheros, datosFicheros);

    /**
     * model Carpetas
     */
    private DefaultListModel dflCarpetas = new DefaultListModel();

    /**
     * Buscar File
     */
    private buscarFile buscarArchivo = new buscarFile();
    /**
     * Buscar Discos
     */
    private buscarDiscos buscarDiscos = new buscarDiscos();

    /**
     * utilidades
     */
    private utils utilidades = new utils();
    /**
     * filtra
     */
    private filtrarFicheros filtrar = new filtrarFicheros();
    /**
     * crear directorio
     */
    private crearDir crearFichero = new crearDir();
    /**
     * eliminar directorios
     */
    private eliminarDirectorio eliminar = new eliminarDirectorio();

    /**
     * Almacen de directorios y ficheros
     */
    private ArrayList<File> almacenDirectorios = new ArrayList<File>();

    /**
     * almacen de ficheros
     */
    private ArrayList<File> almacenFicheros = new ArrayList<File>();
    /**
     * almacen de discos
     */
    private ArrayList<File> almacenDiscos = new ArrayList<File>();

    /**
     * interfaz grafica
     */
    public interfaz_grafica() {
        initComponents();
        table_discos.setModel(dftDiscos);
        tableFicheros.setModel(dftFicheros);
        listCarpetas.setModel(dflCarpetas);
        insertarDiscos();
    }

    /**
     * metodo para insertar los buscar / insertar los discos en la tabla
     */
    private void insertarDiscos() {
        almacenDiscos = buscarDiscos.getUnidades();
        insertarTablaDiscos();
    }

    /**
     * insertar discos tabla
     */
    private void insertarTablaDiscos() {

        Object[] fila = new Object[datosDiscos.length];

        for (File f : almacenDiscos) {
            fila[0] = f.toString();
            fila[1] = ((((f.getTotalSpace() - f.getFreeSpace()) / 1024) / 1024) / 1024) + "gb";
            fila[2] = (((f.getFreeSpace() / 1024) / 1024) / 1024) + "gb";
            fila[3] = (((f.getTotalSpace() / 1024) / 1024) / 1024) + "gb";
            dftDiscos.addRow(fila);
        }
    }

    /**
     * metodo para insertar los buscar / insertar los ficheros en la tabla
     *
     * @param ruta ruta para buscar los archivos
     */
    private void insertarFicheros(String ruta) {
        buscarFicheros(ruta);
        insertarTablaFicheros(almacenFicheros);
    }

    /**
     * Inserta los ficheros a la tabla
     *
     * @param almacen archivos que insertar en la tabla de ficheros
     */
    private void insertarTablaFicheros(ArrayList<File> almacen) {

        Object[] fila = new Object[datosFicheros.length];
        limpiarTablaFicheros();

        for (File l : almacen) {
            fila[0] = l.getName();
            fila[1] = l.canRead();
            fila[2] = l.canWrite();
            fila[3] = l.canExecute();
            fila[4] = utilidades.dividirExtension(l.getPath());
            fila[5] = (((l.length() / 1024) / 1024) / 1024) + "kb";
            dftFicheros.addRow(fila);
        }
    }

    /**
     *
     * @param ruta donde buscar las carpetas
     */
    private void insertarCarpetas(String ruta) {
        dflCarpetas.clear();
        buscarDirectorios(ruta);

        for (File f : almacenDirectorios) {
            dflCarpetas.addElement(f);
        }
    }

    /**
     * Metodo para buscar los ficheros y las carpeta tambien actualiza el txf de
     * busqueda cada vez que cambiemos de ruta
     *
     * @param ruta
     */
    private void buscar(String ruta) {
        txfBuscar.setText(ruta);
        insertarFicheros(ruta);
        insertarCarpetas(ruta);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        table_discos = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        listCarpetas = new javax.swing.JList<String>();
        btnSearch = new javax.swing.JButton();
        txfBuscar = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableFicheros = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        btnCrear = new javax.swing.JButton();
        txfCrear = new javax.swing.JTextField();
        txfFiltrar = new javax.swing.JTextField();
        btnFiltrar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnAtras = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        table_discos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        table_discos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_discosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table_discos);

        jLabel1.setText("Discos");

        jLabel2.setText("Carpetas");

        listCarpetas.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        listCarpetas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listCarpetasMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(listCarpetas);

        btnSearch.setText("Buscar");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        tableFicheros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(tableFicheros);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));

        btnCrear.setText("Crear");
        btnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearActionPerformed(evt);
            }
        });

        btnFiltrar.setText("Filtrar");
        btnFiltrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiltrarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txfFiltrar)
                            .addComponent(txfCrear))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnCrear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnFiltrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(12, 12, 12))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCrear)
                    .addComponent(txfCrear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txfFiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFiltrar))
                .addGap(18, 18, 18)
                .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                .addContainerGap())
        );

        btnAtras.setText("<- Atras");
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 595, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAtras))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(txfBuscar)
                                .addGap(18, 18, 18)
                                .addComponent(btnSearch))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 373, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSearch)
                    .addComponent(txfBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAtras))
                .addGap(5, 5, 5)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     *
     * @param evt
     */
    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        buscar(txfBuscar.getText());
    }//GEN-LAST:event_btnSearchActionPerformed

    /**
     * mostrar las carpetas base de nuestros discos
     *
     * @param evt
     */
    private void table_discosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_discosMouseClicked
        buscar(table_discos.getValueAt(table_discos.getSelectedRow(), 0) + "");
    }//GEN-LAST:event_table_discosMouseClicked

    /**
     * con doble click avanza a una carpeta superior, y con un click muestra los
     * ficheros en la tabla de ficheros
     *
     * @param evt evento de click
     */
    private void listCarpetasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listCarpetasMouseClicked
        try {
            if (evt.getClickCount() == 2 && evt.getButton() == MouseEvent.BUTTON1) {
                accederCarpeta(dflCarpetas.getElementAt(listCarpetas.getSelectedIndex()).toString());
            } else if ((evt.getClickCount() == 1 && evt.getButton() == MouseEvent.BUTTON1)) {
                if (listCarpetas.getSelectedIndex() != -1) {
                    insertarFicheros(dflCarpetas.getElementAt(listCarpetas.getSelectedIndex()).toString());
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_listCarpetasMouseClicked

    /**
     * Boton filtrar
     *
     * @param evt evento de click
     */
    private void btnFiltrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiltrarActionPerformed
        filtrarLista();
    }//GEN-LAST:event_btnFiltrarActionPerformed
    /**
     * Boton para crear
     *
     * @param evt evento de click
     */
    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed
        crearDirectorio();
    }//GEN-LAST:event_btnCrearActionPerformed
    /**
     *
     * Boton para eliminar
     */
    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        eliminar();
    }//GEN-LAST:event_btnEliminarActionPerformed

    /**
     * Boton para ir nivel hacia atras en la ruta,
     *
     * @param evt evento de click
     */
    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        try {
            if (atras() != "") {
                buscar(atras());
            } else {
                dflCarpetas.clear();
                limpiarTablaFicheros();
                txfBuscar.setText(atras());
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_btnAtrasActionPerformed

    /**
     * Funcion para retroceder un nivel en la ruta.
     *
     * @return devuelve la ruta cortada
     */
    public String atras() {
        String ruta = txfBuscar.getText();

        if (ruta != "" && ruta.length() > 1) {
            File f = new File(ruta);
            ruta = f.getParent();
        }
        return ruta;
    }

    /**
     * Elimina el directorio seleccionado en el jlist
     */
    private void eliminar() {
        if (listCarpetas.getSelectedIndex() != -1) {
            eliminar.eliminarDir(dflCarpetas.get(listCarpetas.getSelectedIndex()).toString());
            buscar(txfBuscar.getText());
        }
    }

    /**
     * Metodo para crear un directorio en el directorio selecciona, comprueba
     * que tenemos un directorio seleccionado, y que tenga un nombre indicado en
     * el textfield para crear, comprobaremos con el metodo crearFichero que es
     * posible si puede crear el fichero, si no puede crearlo mostraremos un
     * JOptionPane indicando que no pudimos crearlo, si por ejemplo tenemos un
     * nombre de directorio escrito pero no tenemos ningun directorio
     * seleccionado en el jList, pero si tenemos un disco seleccionado en la
     * tabla entonces creamos el directorio en la ruta root
     */
    private void crearDirectorio() {
        if (!txfCrear.getText().isEmpty()
                && listCarpetas.getSelectedIndex() != -1) {

            if (!crearFichero.crearDirectorio(txfCrear.getText(),
                    dflCarpetas.get(listCarpetas.getSelectedIndex()).toString())) {
                JOptionPane.showMessageDialog(null,
                        "Ocurrio un problema introduzca parametros distintos",
                        "Error!", JOptionPane.ERROR_MESSAGE);
            }
        } else if (!txfCrear.getText().isEmpty()
                && table_discos.getSelectedRow() != -1) {
            if (!crearFichero.crearDirectorio(txfCrear.getText(), txfBuscar.getText())) {
                JOptionPane.showMessageDialog(null,
                        "Ocurrio un problema introduzca parametros distintos",
                        "Error!", JOptionPane.ERROR_MESSAGE);
            }
        } else if (!txfBuscar.getText().isBlank()) {
            if (!crearFichero.crearDirectorio(txfCrear.getText(), txfBuscar.getText())) {
                JOptionPane.showMessageDialog(null,
                        "Ocurrio un problema introduzca parametros distintos",
                        "Error!", JOptionPane.ERROR_MESSAGE);
            }
        }
        buscar(txfBuscar.getText());
    }

    /**
     * Metodo para filtrar la lista
     */
    private void filtrarLista() {
        insertarTablaFicheros(filtrar.filtrarFicherosExt(txfFiltrar.getText(), almacenFicheros));
    }

    /**
     * MEtodo para acceder a una carpeta
     *
     * @param ruta
     */
    private void accederCarpeta(String ruta) {
        buscar(ruta);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(interfaz_grafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(interfaz_grafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(interfaz_grafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(interfaz_grafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new interfaz_grafica().setVisible(true);
            }
        });
    }

    /**
     * limpia la tabla de ficheros
     */
    public void limpiarTablaFicheros() {
        while (dftFicheros.getRowCount() > 0) {
            dftFicheros.removeRow(0);
        }
    }

    /**
     * Busca los archivos en la interfaz
     *
     * @param ruta ruta de busqueda
     */
    public void buscarFicheros(String ruta) {
        almacenFicheros = buscarArchivo.buscarFicheros(ruta);
    }

    /**
     *
     * @param ruta ruta de busqueda
     */
    public void buscarDirectorios(String ruta) {
        almacenDirectorios = buscarArchivo.buscarDirectorios(ruta);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnCrear;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnFiltrar;
    private javax.swing.JButton btnSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JList<String> listCarpetas;
    private javax.swing.JTable tableFicheros;
    private javax.swing.JTable table_discos;
    private javax.swing.JTextField txfBuscar;
    private javax.swing.JTextField txfCrear;
    private javax.swing.JTextField txfFiltrar;
    // End of variables declaration//GEN-END:variables
}
