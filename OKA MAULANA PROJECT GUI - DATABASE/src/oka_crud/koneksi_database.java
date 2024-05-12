/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oka_crud;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



/**
 *
 * @author ASUS
 */
public class koneksi_database {
        private static final String URL = "jdbc:mysql://localhost:3306/db_mahasiswa";
    private static final String USER = "root"; 
    private static final String PASSWORD = "";
    
    public static Connection getConnection() { // method --> mengecek apakah database sudah terkoneksi dengan java
        Connection conn = null; //tidak ada koneksi
        try { // mencoba melakukan koneksi
            conn = DriverManager.getConnection(URL, USER, PASSWORD); // dengan memeriksa ini
            System.out.println("Koneksi ke database berhasil.");
        } catch (SQLException e) { //  error
            System.out.println("Koneksi ke database gagal: " + e.getMessage());
        }
        return conn;
    }   
    
}
