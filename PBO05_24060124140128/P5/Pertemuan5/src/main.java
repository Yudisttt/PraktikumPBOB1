/*
File : main.java
Deskripsi : Kelas main untuk menguji fungsi bangun datar
Nama : Ida Bagus Ngurah Yudistira K
NIM  : 24060124140128
Tanggal : 18 Maret 2026
*/

public class main {
    public static void main(String[] args) {

        BangunDatar P1 = new Persegi(10, "Merah", "Solid");   
        Persegi P2 = new Persegi(5, "Biru", "Dashed");         
        BangunDatar L1 = new Lingkaran(7, "Hijau", "Dotted");  
        Lingkaran L2 = new Lingkaran(14, "Kuning", "Solid");   
 
        // Memanggil method dari objek Persegi dan Lingkaran
        System.out.println("===== Info P1 (Persegi, sisi=10) =====");
        P1.printInfo();
        System.out.println("Luas     : " + P1.getLuas());
        System.out.println("Keliling : " + P1.getKeliling());
 
        System.out.println("\n===== Info P2 (Persegi, sisi=5) =====");
        P2.printInfo();
        System.out.println("Luas     : " + P2.getLuas());
        System.out.println("Keliling : " + P2.getKeliling());
        System.out.println("Diagonal : " + P2.getDiagonal()); 
 
        System.out.println("\n===== Info L1 (Lingkaran, r=7) =====");
        L1.printInfo();
        System.out.println("Luas     : " + L1.getLuas());
        System.out.println("Keliling : " + L1.getKeliling());
 
        System.out.println("\n===== Info L2 (Lingkaran, r=14) =====");
        L2.printInfo();
        System.out.println("Luas     : " + L2.getLuas());
        System.out.println("Keliling : " + L2.getKeliling());
 
        
        System.out.println("\n===== Perbandingan Luas dan Keliling =====");
        System.out.println("Apakah luas P1 == luas P2?       " + P1.isEqualLuas(P2));
        System.out.println("Apakah luas P1 == luas L1?       " + P1.isEqualLuas(L1));
        System.out.println("Apakah keliling P2 == keliling L1? " + P2.isEqualKeliling(L1));
 
 
        System.out.println("\n===== Uji ZoomIn pada P2 (sisi awal=5) =====");
        System.out.println("Sisi sebelum zoomIn : " + P2.getSisi());
        P2.zoomIn();
        System.out.println("Sisi setelah zoomIn : " + P2.getSisi());
 
        System.out.println("\n===== Uji ZoomOut pada P2 =====");
        P2.zoomOut();
        System.out.println("Sisi setelah zoomOut : " + P2.getSisi());
 
        System.out.println("\n===== Uji Zoom 200% pada L2 (r awal=14) =====");
        System.out.println("Jari-jari sebelum zoom : " + L2.getJari());
        L2.zoom(200);
        System.out.println("Jari-jari setelah zoom 200% : " + L2.getJari());
 
        
        System.out.println("\n===== Uji IResize sebagai reference type =====");
        IResize r1 = new Persegi(8, "Ungu", "Solid");
        r1.zoomIn();
        
        System.out.println("ZoomIn via IResize reference berhasil!");
 
        
        System.out.println("\n===== Counter Objek =====");
        P1.printCounter(); // printCounter BangunDatar
        P2.printCounter(); // printCounter Persegi
        L2.printCounter(); // printCounter Lingkaran
    }
}

