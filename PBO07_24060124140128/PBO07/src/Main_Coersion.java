// file : Main_Coersion.java
// deskripsi : Demo polimorfisme ad hoc coersion - konversi tipe data primitif dan objek String
// Nama : Ida Bagus Ngurah Yudistira K
// NIM  : 24060124140128

public class Main_Coersion {
    public static void main(String[] args) {

        // === (a) ilustrasi coersion tipe dasar ===
        int angka = 65;
        char huruf = (char) angka;       // int ke char
        double real = (double) angka;    // int ke double

        System.out.println("=== (a) Coersion Tipe Dasar ===");
        System.out.println("Sebagai int    : " + angka);
        System.out.println("Sebagai char   : " + huruf);
        System.out.println("Sebagai double : " + real);

        // === (b) int -> double -> int lagi di variabel berbeda ===
        System.out.println("\n=== (b) Double dikembalikan ke Int ===");
        int nilaiAwal = 65;
        double nilaiReal = (double) nilaiAwal;
        int nilaiKembali = (int) nilaiReal;   // casting balik
        System.out.println("int awal    : " + nilaiAwal);
        System.out.println("jadi double : " + nilaiReal);
        System.out.println("balik int   : " + nilaiKembali);

        // === (c) String X dan Y, konkatenasi vs penjumlahan ===
        System.out.println("\n=== (c) String Integer ===");
        String X = "1234";
        String Y = "5678";
        String S = X + Y;                           // konkatenasi string
        Integer Z = Integer.parseInt(X) + Integer.parseInt(Y); // jumlah angka
        System.out.println("X = " + X + ", Y = " + Y);
        System.out.println("S (konkatenasi) = " + S);
        System.out.println("Z (penjumlahan) = " + Z);

        // === (d) String P dan Q, konkatenasi vs penjumlahan double ===
        System.out.println("\n=== (d) String Double ===");
        String P = "12.34";
        String Q = "56.78";
        String R = P + Q;                               // konkatenasi
        Double D = Double.parseDouble(P) + Double.parseDouble(Q); // jumlah
        System.out.println("P = " + P + ", Q = " + Q);
        System.out.println("R (konkatenasi) = " + R);
        System.out.println("D (penjumlahan) = " + D);

        // === (e) objek Integer A dari konversi S ===
        System.out.println("\n=== (e) Integer A dari konversi S ===");
        Integer A = Integer.parseInt(S);
        System.out.println("S = " + S);
        System.out.println("A = " + A);

        // === (f) objek String T dari konversi A ===
        System.out.println("\n=== (f) String T dari konversi A ===");
        String T = A.toString();
        System.out.println("A = " + A);
        System.out.println("T = " + T);
    }
}
