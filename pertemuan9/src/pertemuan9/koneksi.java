/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan9;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/*
 * @author LAB F
 */
public class koneksi {

    static Connection getKoneksi;
    
  public static Connection getKoneksi() throws SQLException{
   
     Connection cnn = null;
     
      try {
          Class.forName("com.mysql.cj.jdbc.Driver");
          cnn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bukuteman", "root", "");
      } catch (ClassNotFoundException ex) {
          Logger.getLogger(koneksi.class.getName()).log(Level.SEVERE, null, ex);
      }
   
      return cnn;
    }
}
