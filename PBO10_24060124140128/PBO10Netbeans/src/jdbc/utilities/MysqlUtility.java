package jdbc.utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MysqlUtility {

    private static Connection koneksi;

    public static Connection getConnection() {

        if (koneksi == null) {

            try {

                String url = "jdbc:mysql://localhost/pbo";
                String user = "root";
                String password = "Tugus.iyaq1";

                DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());

                koneksi = DriverManager.getConnection(url, user, password);

            } catch (SQLException e) {
                e.printStackTrace();
            }

        }

        return koneksi;
    }
}