/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zaragoza_carlos_act01__probando_conexiones_a_distintas_bbdd.controller.oracle_controller;

import com.sun.jdi.connect.spi.Connection;

import java.sql.*;

public class Oracle {

    public void iniciarBaseDeDatos() {

        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");

            java.sql.Connection con = DriverManager.getConnection(
                    "jdbc:oracle:thin:@localhost:1521:xe", "system", "oracle");

            Statement stmt = con.createStatement();

            ResultSet rs = stmt.executeQuery("select * from emp");
            while (rs.next()) {
                System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3));
            }

            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }

    }

}
