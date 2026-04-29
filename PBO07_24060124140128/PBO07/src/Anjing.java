// file : Anjing.java
// deskripsi : Kelas anak Anjing yang mewarisi Anabul, bergerak melata dan bersuara guk-guk
// Nama : Ida Bagus Ngurah Yudistira K
// NIM  : 24060124140128

public class Anjing extends Anabul {

    public Anjing(String nama) {
        super(nama);
    }

    @Override
    public void gerak() {
        System.out.println(nama + " (Anjing) bergerak dengan melata");
    }

    @Override
    public void bersuara() {
        System.out.println(nama + " (Anjing) bersuara : Guk-guk!");
    }
}
