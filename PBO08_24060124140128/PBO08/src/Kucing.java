// file : Kucing.java
// deskripsi : Kelas anak Kucing yang mewarisi Anabul, ditambah atribut bobot
// Nama : Ida Bagus Ngurah Yudistira K
// NIM  : 24060124140128

public class Kucing extends Anabul {

    // atribut bobot dalam kilogram
    protected double bobot;

    public Kucing(String nama, double bobot) {
        super(nama);
        this.bobot = bobot;
    }

    public double getBobot() {
        return bobot;
    }

    @Override
    public void gerak() {
        System.out.println(nama + " (Kucing) bergerak dengan melata");
    }

    @Override
    public void bersuara() {
        System.out.println(nama + " (Kucing) bersuara : Meong!");
    }
}
