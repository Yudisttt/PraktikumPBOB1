// file : Burung.java
// deskripsi : Kelas anak Burung yang mewarisi Anabul, bergerak terbang dan bersuara cuit
// Nama : Ida Bagus Ngurah Yudistira K
// NIM  : 24060124140128

public class Burung extends Anabul {

    public Burung(String nama) {
        super(nama);
    }

    @Override
    public void gerak() {
        System.out.println(nama + " (Burung) bergerak dengan terbang");
    }

    @Override
    public void bersuara() {
        System.out.println(nama + " (Burung) bersuara : Cuit!");
    }
}
