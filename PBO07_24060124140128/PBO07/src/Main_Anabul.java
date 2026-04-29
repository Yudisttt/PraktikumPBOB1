// file : Main_Anabul.java
// deskripsi : Program utama untuk simulasi bunyi dan gerakan semua tipe anabul
// Nama : Ida Bagus Ngurah Yudistira K
// NIM  : 24060124140128

public class Main_Anabul {
    public static void main(String[] args) {

        // bikin array anabul - pakai tipe induk (polimorfisme inclusion)
        Anabul[] peliharaan = new Anabul[4];
        peliharaan[0] = new Kucing("Mochi");
        peliharaan[1] = new Anjing("Rocky");
        peliharaan[2] = new Burung("Tweety");
        peliharaan[3] = new Kucing("Luna");

        System.out.println("=== Simulasi Semua Anabul ===\n");

        // loop semua, manggil gerak dan bersuara
        // meski tipenya Anabul, yang dipanggil method kelas anak masing2
        for (int i = 0; i < peliharaan.length; i++) {
            peliharaan[i].bersuara();
            peliharaan[i].gerak();
            System.out.println();
        }
    }
}
