/*
File : Irezise.java
Deskripsi : Interface untuk metode zoom pada bangun datar
Nama : Ida Bagus Ngurah Yudistira K
NIM  : 24060124140128
Tanggal : 18 Maret 2026
*/

public interface IResize {
 
    // Menambah ukuran menjadi 10% lebih besar
    public void zoomIn();
 
    // Mengurangi ukuran menjadi 10% lebih kecil
    public void zoomOut();
 
    // Menskalakan ukuran sesuai dengan input percent yang diberikan
    public void zoom(int percent);
}
 