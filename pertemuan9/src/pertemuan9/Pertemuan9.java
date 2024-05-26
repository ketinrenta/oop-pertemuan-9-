
package pertemuan9;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


/**
 *
 * @author ketin renta
 * nim : 2201010567
 * tgl : 2024-05-13
 */
public class Pertemuan9 {

    /**
     * @param args the command line arguments
     * @throws java.sql.SQLException
     */
    public static void main(String[] args) throws SQLException, java.sql.SQLException {
     new frm01().setVisible(true);
    //frm01 f1 = new frm01();
    //f1.setResizable(true);
    //f1.setAlwaysOnTop(true);
    //f1.setVisible(true);
    list_all();
    }
    private static void list_all() throws SQLException, java.sql.SQLException{
        Connection cnn = koneksi.getKoneksi();
        if(cnn.isClosed()){
            System.out.println("koneksi gagal");
    }else{
            PreparedStatement PS = cnn.prepareStatement("SELECT * FROM datateman");
            ResultSet rs = PS.executeQuery();
            while (rs.next()){
               System.out.println( "+No Record : "+rs.getInt("idteman"));
               System.out.println( "+Nama : "+rs.getInt("nama"));
               System.out.println("+Alamat : "+ rs.getInt("alamat"));
               System.out.println("+telp : "+ rs.getInt("telp"));
               
            }
            cnn.close();
        }

    }

    private static class SQLException extends Exception {

        public SQLException() {
        }
    }
    
    
}
