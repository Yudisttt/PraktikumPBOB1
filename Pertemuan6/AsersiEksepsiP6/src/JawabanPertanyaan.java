/**
 * File        : JawabanPertanyaan.java
 * Deskripsi   : Jawaban pertanyaan-pertanyaan dari modul praktikum 6
 *               Asersi dan Eksepsi
 * Nama        : Ida Bagus Ngurah Yudistira K
 * NIM         : 24060124140128
 * Tanggal     : 1 April 2026
 */


// PERTANYAAN 1
// "Secara konsep, ada yang kurang tepat pada program Asersi2. Jelaskan!"

// JAWABAN:
// Yang kurang tepat pada program Asersi2 adalah penggunaan asersi (assert)
// untuk memvalidasi INPUT dari pengguna (jariJari = 0).
// Asersi seharusnya TIDAK digunakan untuk memvalidasi parameter input atau
// data yang berasal dari luar program (user input, argumen method publik, dsb).
// Asersi hanya cocok untuk mengecek asumsi internal programmer selama
// pengembangan/debugging, bukan untuk logika validasi yang harus selalu aktif.
//
// Selain itu, asersi secara default DINONAKTIFKAN saat runtime biasa
// (tanpa flag -enableassertions). Artinya, jika program dijalankan dengan
// 'java Asersi2' (tanpa flag), asersi tidak akan bekerja dan program tetap
// menghitung keliling dengan jariJari = 0 tanpa ada peringatan apapun.
// Solusi yang lebih tepat adalah menggunakan eksepsi (Exception/
// IllegalArgumentException) untuk memvalidasi nilai jariJari,
// karena eksepsi selalu aktif dan memang dirancang untuk menangani
// kondisi input yang tidak valid.


// PERTANYAAN 2
// "*Ketika eksepsi terjadi, apakah baris 12 pada AngkaSial.java dieksekusi?"

// JAWABAN:
// TIDAK. Baris 12 pada AngkaSial.java adalah:
//     System.out.println(angka+" bukan angka sial");
// Ketika angka == 13, pada baris 10 program langsung melempar eksepsi:
//     throw new AngkaSialException();
// Eksekusi method cobaAngka() langsung berhenti di situ dan melompat
// ke blok catch di pemanggil. Baris 12 TIDAK pernah dieksekusi
// karena alur program sudah dialihkan oleh throw sebelum sampai ke baris 12.


// PERTANYAAN 3 (Praktikum 3.4 - AngkaSial.java)
// "*Apakah baris 21 pada AngkaSial.java dieksekusi?"

// JAWABAN:
// YA. Baris 21 pada AngkaSial.java adalah:
//     }catch(AngkaSialException ase){
// Baris 21 adalah awal blok catch, dan blok ini DIEKSEKUSI ketika
// eksepsi AngkaSialException terjadi (yaitu saat as.cobaAngka(13) dipanggil
// pada baris 19 di dalam blok try).
// Setelah eksepsi dilempar, alur program langsung melompat ke blok catch,
// sehingga as.cobaAngka(12) pada baris 20 TIDAK dieksekusi,
// namun isi blok catch (baris 23 dan 24) DIEKSEKUSI, yaitu mencetak:
//     "jangan memasukkan angka 13 karena angka sial !!!"
//     "hati-hati memasukkan angka!!!"


