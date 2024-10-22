package com.mycompany.proyectoprogramacion;
import java.sql.*;
public class ProyectoProgramacion {

    public static void main(String[] args) {
        Connection conn = null;
        try {
            //cargar el driver
            Class.forName("org.sqlite.JDBC");
            conn = DriverManager.getConnection("jdbc:sqlite:test01.sqlite");

            if (conn != null)
		System.out.println("Conexion a base de datos ... Ok");
            else
                System.out.println("Conexion a base de datos: problemas!");

        conn.close();        //cerrar la BD

    }
        catch (SQLException a) {
            System.out.println(a);
        }
        catch (ClassNotFoundException ex) {
            System.out.println(ex);
        }
        catch (Exception ex) {
            System.out.println(ex);
    }
  }
}