/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugasproject_1;
import com.mysql.jdbc.Driver;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author DELL 5400
 */
public class Tugasproject_1 {
    static final String DB_Url = "jdbc:mysql://localhost:3306/db_unidha";
    private static Connection Test_Konek;
    public static Connection DB_Konek() throws SQLException,ClassNotFoundException {
        try{
            Driver myDriver = new com.mysql.jdbc.Driver();
            DriverManager.registerDriver(myDriver);
            System.out.println("Proses Deteksi Driver Berhasil");
            
            final java.sql.Connection tersambung = DriverManager.getConnection(DB_Url,"root","");
        } catch (final SQLException ex){
            System.out.println("Koneksi Database Gagal");
        }
       return Test_Konek;
       }
 
    }
