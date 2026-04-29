// file : Kucing.java
// deskripsi : Kelas anak Kucing yang mewarisi Anabul, bergerak melata dan bersuara meong
// Nama : Ida Bagus Ngurah Yudistira K
// NIM  : 24060124140128

public class Kucing extends Anabul {

    public Kucing(String nama) {
        super(nama);
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
