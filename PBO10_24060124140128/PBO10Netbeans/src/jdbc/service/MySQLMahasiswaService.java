package jdbc.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import jdbc.model.mahasiswa;
import jdbc.utilities.MysqlUtility;

public class MySQLMahasiswaService {

    private Connection koneksi;

    public MySQLMahasiswaService() {
        koneksi = MysqlUtility.getConnection();
    }

    public void insert(mahasiswa mhs) {

        String sql = "INSERT INTO mahasiswa VALUES (?, ?)";

        try {

            PreparedStatement ps = koneksi.prepareStatement(sql);

            ps.setInt(1, mhs.getId());
            ps.setString(2, mhs.getNama());

            ps.executeUpdate();

            System.out.println("Data berhasil ditambah");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void tampilData() {

        String sql = "SELECT * FROM mahasiswa";

        try {

            PreparedStatement ps = koneksi.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                System.out.println(
                        rs.getInt("id") + " - " +
                        rs.getString("nama")
                );
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void update(mahasiswa mhs) {

        String sql = "UPDATE mahasiswa SET nama=? WHERE id=?";

        try {

            PreparedStatement ps = koneksi.prepareStatement(sql);

            ps.setString(1, mhs.getNama());
            ps.setInt(2, mhs.getId());

            ps.executeUpdate();

            System.out.println("Data berhasil diupdate");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void delete(int id) {

        String sql = "DELETE FROM mahasiswa WHERE id=?";

        try {

            PreparedStatement ps = koneksi.prepareStatement(sql);

            ps.setInt(1, id);

            ps.executeUpdate();

            System.out.println("Data berhasil dihapus");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
